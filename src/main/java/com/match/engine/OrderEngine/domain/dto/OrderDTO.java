package com.match.engine.OrderEngine.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

public class OrderDTO {

	 private String Instrument;
	  private String buySell;
	  private String orderType;
	  private Double Price;
	  private int Quantity;
	  private Long globalOrderId;
	  private UUID orderId;
	  private LocalDate orderTimeStamp;
	  
	  
	  
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
	  public String getOrderType() {
		  return orderType;
	  }
	  public void setOrderType(String orderType) {
		  this.orderType = orderType;
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
	  public Long getGlobalOrderId() {
		  return globalOrderId;
	  }
	  public void setGlobalOrderId(Long globalOrderId) {
		  this.globalOrderId = globalOrderId;
	  }
	  public UUID getOrderId() {
		  return orderId;
	  }
	  public void setOrderId(UUID uuid) {
		  this.orderId = uuid;
	  }
	  public LocalDate getOrderTimeStamp() {
		  return orderTimeStamp;
	  }
	  public void setOrderTimeStamp(LocalDate orderTimeStamp) {
		  this.orderTimeStamp = orderTimeStamp;
	  }
	
}
