package com.utl.examen.service;

import com.utl.examen.entities.Sale;
import com.utl.examen.repositories.ProductRepository;
import com.utl.examen.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private ProductRepository productRepository;

    public boolean addSale(Long productId) {
        return productRepository.findById(productId).map(product -> {
            Sale sale = new Sale();
            sale.setProduct(product);
            sale.setSaleDate(LocalDateTime.now());
            saleRepository.save(sale);
            return true;
        }).orElse(false);
    }

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }
}
