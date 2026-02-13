package com.match.engine.OrderEngine.domain;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TradeEntity {

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID tradeId; 
    
    @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID contractId; 
	private Double price; 
	private Integer quantity; 
	
    @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID buyerOrderId; 
	
    @GeneratedValue(strategy = GenerationType.AUTO)
	private UUID sellerOrderId; 
	
	private LocalDate timestamp;

	public UUID getTradeId() {
		return tradeId;
	}

	public void setTradeId(UUID tradeId) {
		this.tradeId = tradeId;
	}

	public UUID getContractId() {
		return contractId;
	}

	public void setContractId(UUID contractId) {
		this.contractId = contractId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public UUID getBuyerOrderId() {
		return buyerOrderId;
	}

	public void setBuyerOrderId(UUID buyerOrderId) {
		this.buyerOrderId = buyerOrderId;
	}

	public UUID getSellerOrderId() {
		return sellerOrderId;
	}

	public void setSellerOrderId(UUID sellerOrderId) {
		this.sellerOrderId = sellerOrderId;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	} 
	
	
	
	
	
	
	
	
	
}
