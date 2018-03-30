package com.oryx.controller;

import com.oryx.model.bu.sale.Product;
import com.oryx.model.system.ref.Contact;
import com.oryx.service.ProductService;
import com.oryx.vo.ContactListVO;
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


    @RequestMapping( method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> getDescription(@RequestParam String code, @RequestParam String format) {
        List<Product> products = productService.findByCode(code);
        if(products != null && !products.isEmpty()) {
            return new ResponseEntity<Product>(products.get(0), HttpStatus.OK);
        }

        Product product = new Product();
        product.setProductCode(code);
        product.setProductName("Nokia6");
        product.setDescription("Nokia6 Description");
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }
}