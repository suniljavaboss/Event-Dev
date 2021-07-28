/**
 * 
 */
package com.snl.orderservice.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sunil Jboss
 *
 */
public class Payment {

	private int paymentId;
	private String paymentStatus;
	private String transectionId;
	private int orderId;
	private Double amount;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransectionId() {
		return transectionId;
	}
	public void setTransectionId(String transectionId) {
		this.transectionId = transectionId;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentId, String paymentStatus, String transectionId) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transectionId = transectionId;
	}
	
}
