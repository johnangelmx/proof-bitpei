package com.bitpei.proofbitpei.repository;

import com.bitpei.proofbitpei.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.active = true")
    List<Product> findByActive(boolean b);
}
