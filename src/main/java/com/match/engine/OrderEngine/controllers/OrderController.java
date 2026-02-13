package com.match.engine.OrderEngine.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.match.engine.OrderEngine.domain.dto.OrderDTO;
import com.match.engine.OrderEngine.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	} 
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> getOrders(){
		
		List<OrderDTO> orders = orderService.getOrders(); 
		return ResponseEntity.ok().body(orders);
	}
	

}
