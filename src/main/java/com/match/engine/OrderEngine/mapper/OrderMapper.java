package com.match.engine.OrderEngine.mapper;

import com.match.engine.OrderEngine.domain.OrderEntity;
import com.match.engine.OrderEngine.domain.dto.OrderDTO;
import com.match.engine.OrderEngine.domain.dto.OrderRequestDTO;

public class OrderMapper {
	
	public static OrderDTO toDto(OrderEntity orderEntity) {
		OrderDTO orderDTO = new OrderDTO();
		
		
		orderDTO.setOrderId(orderEntity.getOrderId());
		orderDTO.setBuySell(orderEntity.getBuySell());
		orderDTO.setGlobalOrderId(orderEntity.getGlobalOrderId());
		orderDTO.setInstrument(orderEntity.getInstrument());
		orderDTO.setOrderTimeStamp(orderEntity.getOrderTimeStamp());
		orderDTO.setOrderType(orderEntity.getOrderType());
		orderDTO.setPrice(orderEntity.getPrice());
		orderDTO.setQuantity(orderEntity.getQuantity());
		return orderDTO;
	}
	
	
	
	public static OrderEntity toModel(OrderRequestDTO orderRequestDTO) {
		OrderEntity order = new OrderEntity();
		order.setInstrument(orderRequestDTO.getInstrument());
		
		return order; 
	}

}
