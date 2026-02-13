package com.match.engine.OrderEngine.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class OrderRequestDTO {

	
	@NotBlank(message = "Must not be blank")
	@Size(max= 50, message ="size must not exceed 50 characters")
	private String Instrument; 
	
	
	
	
	
	
	@NotBlank(message = "Must not be blank")
	@Size(max= 50, message ="size must not exceed 50 characters")
	private String buySell; 
	
	
	
	@NotBlank(message = "Must not be blank")
	@Size(max= 50, message ="size must not exceed 50 characters")
	private Double Price; 
	
	
	
	
	
	@NotBlank(message = "Must not be blank")
	@Size(max= 50, message ="size must not exceed 50 characters")
	private int Quantity;  
	
	
	@NotBlank(message = "Must not be blank")
	@Size(max= 50, message ="size must not exceed 50 characters")
	private UUID orderId; 
	
	@NotBlank(message = "must not be blank")
	private String orderTimeStamp;

	public String getInstrument() {
		return Instrument;
	}

	public void setInstrument(String instrument) {
		Instrument = instrument;
	}

	public String getBuySell() {
		return buySell;
	}

	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public UUID getOrderId() {
		return orderId;
	}

	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}

	public String getOrderTimeStamp() {
		return orderTimeStamp;
	}

	public void setOrderTimeStamp(String orderTimeStamp) {
		this.orderTimeStamp = orderTimeStamp;
	} 
}
