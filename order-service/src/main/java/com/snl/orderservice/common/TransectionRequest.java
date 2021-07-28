/**
 * 
 */
package com.snl.orderservice.common;

import com.snl.orderservice.entity.Order;
import com.snl.orderservice.model.Payment;

/**
 * @author sunil Jboss
 *
 */
public class TransectionRequest {

	private Order order;
	private Payment payment;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public TransectionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
