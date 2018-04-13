package com.oryx.controller.mob;

import com.google.gson.Gson;
import com.oryx.model.bu.sale.Product;
import com.oryx.model.system.ref.Contact;
import com.oryx.service.ProductService;
import com.oryx.vo.ContactListVO;
import com.oryx.ws.ref.model.ProductVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Controller
@RequestMapping(value = "/protected/products")
public class ProductsController {

    private static final String DEFAULT_PAGE_DISPLAYED_TO_USER = "0";

    @Autowired
    private ProductService productService;

    @Autowired
    private MessageSource messageSource;


    @RequestMapping(value = "/getProduct", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> getProduct(@RequestParam(name = "xcode") String xcode, @RequestParam(name = "xformat") String xformat) {
        Product product = productService.findByCode(xcode);
        if(product != null) {
            return new ResponseEntity<Product>(product, HttpStatus.FOUND);
        }

        return new ResponseEntity<Product>(product, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/createProduct", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> createProduct(@RequestParam(name = "product") String jsonProduct) {
        Gson gson = new Gson();
        Product product = gson.fromJson(jsonProduct, Product.class);

        return new ResponseEntity<Product>(product, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> updateProduct(@RequestParam(name = "xcode") String xcode, @RequestParam(name = "xformat") String xformat) {
        Product product = productService.findByCode(xcode);
        if(product != null) {
            return new ResponseEntity<Product>(product, HttpStatus.FOUND);
        }

        return new ResponseEntity<Product>(product, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/deleteProduct", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> deleteProduct(@RequestParam(name = "xcode") String xcode, @RequestParam(name = "xformat") String xformat) {
        Product product = productService.findByCode(xcode);
        if(product != null) {
            return new ResponseEntity<Product>(product, HttpStatus.FOUND);
        }

        return new ResponseEntity<Product>(product, HttpStatus.NOT_FOUND);
    }
}