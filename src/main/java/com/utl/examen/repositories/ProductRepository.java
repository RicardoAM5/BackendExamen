package com.utl.examen.repositories;

import com.utl.examen.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository  extends JpaRepository<Product, Long> {

    List<Product> findByTitleContainingIgnoreCase(String query);

}
