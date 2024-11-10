package com.utl.examen.controller;

import com.utl.examen.entities.Sale;
import com.utl.examen.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping("/addSale")
    public ResponseEntity<Boolean> addSale(@RequestParam Long productId) {
        boolean success = saleService.addSale(productId);
        return ResponseEntity.ok(success);
    }

    @GetMapping("/sales")
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }
}