/**
 * 
 */
package com.snl.orderservice.common;

import com.snl.orderservice.entity.Order;

/**
 * @author sunil Jboss
 *
 */
public class TransectionResponse {
	private Order order;
	private String transectionId;
	private Double amount;
	private String message;
	public TransectionResponse(Order order, String transectionId, Double amount, String message) {
		super();
		this.order = order;
		this.transectionId = transectionId;
		this.amount = amount;
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getTransectionId() {
		return transectionId;
	}
	public void setTransectionId(String transectionId) {
		this.transectionId = transectionId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public TransectionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
