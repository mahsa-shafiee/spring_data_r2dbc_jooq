package com.jooq.r2dbc_jooq.service;

import com.jooq.r2dbc_jooq.model.dao.JooqProductRepository;
import com.jooq.r2dbc_jooq.model.entity.ProductPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final JooqProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    public ProductService(JooqProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductPojo> getProducts() {
        return productRepository.getProducts();
    }

    public Long addProduct(ProductPojo product) {
        return productRepository.add(product);
    }

    public ProductPojo selectById(Long id) {
        return productRepository.selectOneById(id);
    }

    public boolean deleteProduct(Long id) {
        return productRepository.delete(id);
    }

    public boolean updateProduct(ProductPojo product) {
        return productRepository.update(product);
    }
}
