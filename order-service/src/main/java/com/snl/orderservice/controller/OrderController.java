package com.snl.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snl.orderservice.common.TransectionRequest;
import com.snl.orderservice.common.TransectionResponse;
import com.snl.orderservice.entity.Order;
import com.snl.orderservice.model.Payment;
import com.snl.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
    
	@Autowired
	OrderService orderService;
	
	@PostMapping("/postOrder")
	public TransectionResponse postOrder(@RequestBody TransectionRequest request) {
		
		return orderService.doOrders(request);
		//do the rest call payment and pass the order id
	}
	@GetMapping("/getOrder")
	public String getOrder() {
		
		return null;
	}
}
