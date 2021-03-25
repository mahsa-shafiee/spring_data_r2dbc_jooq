package com.jooq.r2dbc_jooq.controller;

import com.jooq.r2dbc_jooq.model.entity.ProductPojo;
import com.jooq.r2dbc_jooq.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/get")
    public List<ProductPojo> getProducts() {
        return this.productService.getProducts();
    }

    @PostMapping("/add")
    public Long addProduct(@RequestBody ProductPojo productPojo) {
        return productService.addProduct(productPojo);
    }

    @PutMapping("/update")
    public boolean updateProduct(@RequestBody ProductPojo productPojo) {
        return productService.updateProduct(productPojo);
    }

    @GetMapping("/get/{id}")
    public ProductPojo getProductById(@PathVariable("id") Long id) {
        return this.productService.selectById(id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteProductById(@PathVariable("id") Long id) {
        return this.productService.deleteProduct(id);
    }
}
