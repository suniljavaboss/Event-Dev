/**
 * 
 */
package com.snl.paymentservice.service;

import org.springframework.stereotype.Component;

import com.snl.paymentservice.entity.Payment;

/**
 * @author sunil Jboss
 *
 */

@Component
public interface PaymentService {
  
	public Payment doPayment(Payment payment); 
}
