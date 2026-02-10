package com.match.engine.OrderEngine.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class OrderEntity {

  
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID orderId;
  
  
  @NotNull
  @Column(unique = true)
  private String Instrument;
  
  private String buySell;
  private String orderType;
  private Double Price;
  private int Quantity;
  private Long globalOrderId;
 
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
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderTimeStamp() {
		return orderTimeStamp;
	}
	public void setOrderTimeStamp(LocalDate orderTimeStamp) {
		this.orderTimeStamp = orderTimeStamp;
	}

	
}
