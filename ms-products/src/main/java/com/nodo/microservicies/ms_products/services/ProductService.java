package com.nodo.microservicies.ms_products.services;

import com.nodo.microservicies.ms_products.entities.Product;
import com.nodo.microservicies.ms_products.persistence.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }


    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }


    public void save(Product product) {
        productRepository.save(product);
    }
}
