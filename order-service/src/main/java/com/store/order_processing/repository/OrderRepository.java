package com.store.order_processing.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.store.order_processing.model.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    
} 