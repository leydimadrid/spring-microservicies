package com.nodo.microservicies.ms_products.controller;


import com.nodo.microservicies.ms_products.entities.Product;
import com.nodo.microservicies.ms_products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public void saveProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }
}
