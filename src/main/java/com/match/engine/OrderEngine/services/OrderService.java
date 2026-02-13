package com.match.engine.OrderEngine.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.match.engine.OrderEngine.domain.OrderEntity;
import com.match.engine.OrderEngine.domain.dto.OrderDTO;
import com.match.engine.OrderEngine.domain.dto.OrderRequestDTO;
import com.match.engine.OrderEngine.exception.OrderNotFoundException;
import com.match.engine.OrderEngine.mapper.OrderMapper;
import com.match.engine.OrderEngine.repository.OrderRepository;

@Service
public class OrderService {

	private OrderRepository orderRepository;
	
	
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	
	public List<OrderDTO> getOrders(){
		List<OrderEntity> orders = orderRepository.findAll();
		
		List<OrderDTO> orderResponseDTOs = orders.stream().map(order -> OrderMapper.toDto(order)).toList();
		return orderResponseDTOs;
		
		//return orderResponseDTOs.orders.stream().map(OrderMapper::toDto).toList(); 
		
	}
	
	
	
	public OrderDTO createOrder(OrderRequestDTO orderRequestDTO) {
		
		OrderEntity newOrder = orderRepository.save(
				OrderMapper.toModel(orderRequestDTO));
		
		return OrderMapper.toDto(newOrder);
	}
	
	public OrderDTO updateOrder(UUID id, OrderRequestDTO orderRequestDTO) {
		  OrderEntity order = orderRepository.findById(id)
				  .orElseThrow(()-> new OrderNotFoundException());
		  
		  order.setBuySell(orderRequestDTO.getBuySell());
		  
		  OrderEntity updatedOrder = orderRepository.save(order);
		  return OrderMapper.toDto(updatedOrder); 
	}
	
	
	
	
	
	
}
