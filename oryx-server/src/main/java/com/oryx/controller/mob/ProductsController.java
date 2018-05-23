package com.oryx.controller.mob;

import com.google.gson.Gson;
import com.oryx.gson.GsonResponse;
import com.oryx.guid.Guid10Generator;
import com.oryx.model.bu.sale.Product;
import com.oryx.model.system.ose.Codification;
import com.oryx.model.system.ref.Contact;
import com.oryx.service.CodificationService;
import com.oryx.service.ProductService;
import com.oryx.vo.ContactListVO;
import com.oryx.ws.ref.model.ProductVO;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.beans.Beans;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Controller
@RequestMapping(value = "/protected/products")
public class ProductsController {

    private static final String DEFAULT_PAGE_DISPLAYED_TO_USER = "0";
    public static final Guid10Generator guid10Generator = new Guid10Generator();

    @Autowired
    private ProductService productService;

    @Autowired
    private CodificationService codificationService;

    @Autowired
    private MessageSource messageSource;


    @RequestMapping(value = "/fetch", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> fetch(@RequestParam(name = "xcode") String xcode, @RequestParam(name = "xformat") String xformat) {
        Product productResult = null;
        if(xcode != null && !xcode.isEmpty() &&xformat!=null && !xformat.isEmpty()) {
            Codification cod = codificationService.findByServerCodeAndExternalCode(xformat, xcode);
            if(cod != null) {
                String code = cod.getInternalCode();
                productResult = productService.findByCode(code);
                if (productResult != null) {
                    productResult.setCode(cod.getExternalCode());
                    return new ResponseEntity<Product>(productResult, HttpStatus.FOUND);
                }
            }
        }

        return new ResponseEntity<Product>(productResult, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<GsonResponse<Product>> create(@RequestParam(name = "xformat") String xformat, @RequestParam(name = "product") String jsonProduct) {
        Product product = null;
        if(jsonProduct != null && !jsonProduct.isEmpty() && xformat!=null && !xformat.isEmpty()) {
            Gson gson = new Gson();
            product = gson.fromJson(jsonProduct, Product.class);
            if (product.getCode() != null && !product.getCode().isEmpty()){
                try {
                    String xcode = product.getCode();
                    Codification cod = codificationService.findByServerCodeAndExternalCode(xformat, xcode);
                    if(cod != null){
                        Product oldProduct = productService.findByCode(cod.getInternalCode());
                        if(oldProduct != null){
                            oldProduct.setName(product.getName());
                            oldProduct.setDescription(product.getDescription());

                            productService.save(oldProduct);
                        } else {
                            product.setCode(guid10Generator.nextGuid().toUpperCase());
                            cod.setInternalCode(product.getCode());
                            codificationService.save(cod);
                            productService.save(product);
                        }
                    } else {
                        product.setCode(guid10Generator.nextGuid().toUpperCase());
                        codificationService.save(xformat, product.getCode(), xcode);
                        productService.save(product);
                    }
                } catch (Exception e){
                    return new ResponseEntity<GsonResponse<Product>>(new GsonResponse<Product>(e.getMessage(),null), HttpStatus.OK);
                }

                return new ResponseEntity<GsonResponse<Product>>(new GsonResponse<Product>(product), HttpStatus.OK);
            }
        } else {
            return new ResponseEntity<GsonResponse<Product>>(new GsonResponse<Product>("No parameters [format , product]", product), HttpStatus.OK);
        }

        return new ResponseEntity<GsonResponse<Product>>(new GsonResponse<Product>("No parameters [format , product]", product), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> update(@RequestParam(name = "xformat") String xformat, @RequestParam(name = "product") String jsonProduct) {
        Product product = null;
        if(jsonProduct != null && !jsonProduct.isEmpty() && xformat!=null && !xformat.isEmpty()) {
            Gson gson = new Gson();
            product = gson.fromJson(jsonProduct, Product.class);
            if (product.getCode() != null && !product.getCode().isEmpty()){
                try {
                    String xcode = product.getCode();
                    Codification cod = codificationService.findByServerCodeAndExternalCode(xformat, xcode);
                    if(cod != null){
                        Product oldProduct = productService.findByCode(cod.getInternalCode());
                        if(oldProduct != null){
                            oldProduct.setName(product.getName());
                            oldProduct.setDescription(product.getDescription());

                            productService.save(oldProduct);
                        }
                    }
                } catch (Exception e){
                    return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
                }

                return new ResponseEntity<Product>(product, HttpStatus.CREATED);
            }
        } else {
            return new ResponseEntity<String>("No parameters [format , product]", HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<String>("No parameters [format , product]", HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> delete(@RequestParam(name = "xformat") String xformat, @RequestParam(name = "xcode") String xcode) {
        Product product = null;
        if(xformat!=null && !xformat.isEmpty() && xcode!=null && !xcode.isEmpty()) {
            Codification cod = codificationService.findByServerCodeAndExternalCode(xformat, xcode);
            if (cod != null) {
                product = productService.findByCode(cod.getInternalCode());
                if (product != null) {
                    productService.delete(product);
                    codificationService.delete(cod);
                    return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
                }
            }
        } else {
            return new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.NOT_FOUND);
    }
}