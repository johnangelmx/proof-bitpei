package com.bitpei.proofbitpei.repository;

import com.bitpei.proofbitpei.model.Order;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @EntityGraph(attributePaths = "user")
    List<Order> findAll();

    @EntityGraph(attributePaths = "user")
    Optional<Order> findById(Long id);
}
