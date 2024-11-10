package com.utl.examen.service;

import com.utl.examen.entities.Product;
import com.utl.examen.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> searchProducts(String query) {
        return productRepository.findByTitleContainingIgnoreCase(query);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
}
