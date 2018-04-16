package com.oryx.service;

import com.oryx.model.bu.sale.Product;
import com.oryx.model.system.ose.Codification;
import com.oryx.model.system.ref.Uid;
import com.oryx.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Product findByCode(String code) {
       return productRepository.findByProductCode(code);
    }

    @Transactional()
    public Product save(Product product){
        return productRepository.save(product);
    }

    @Transactional()
    public void deleteById(UUID uuid){
        productRepository.deleteById(uuid);
    }

    @Transactional()
    public void delete(Product product){
        productRepository.delete(product);
    }
}