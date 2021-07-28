package com.snl.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snl.orderservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{


	
}
