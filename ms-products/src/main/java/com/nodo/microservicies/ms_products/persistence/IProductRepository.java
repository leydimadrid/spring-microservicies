package com.nodo.microservicies.ms_products.persistence;

import com.nodo.microservicies.ms_products.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
}
