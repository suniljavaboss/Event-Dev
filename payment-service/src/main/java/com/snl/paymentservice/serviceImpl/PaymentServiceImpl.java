/**
 * 
 */
package com.snl.paymentservice.serviceImpl;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snl.paymentservice.entity.Payment;
import com.snl.paymentservice.repository.PaymentRepository;
import com.snl.paymentservice.service.PaymentService;

/**
 * @author sunil Jboss
 *
 */
@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentRepository paymentRepo;
	
	@Override
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransectionId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}
	public String paymentProcessing() {
		return new Random().nextBoolean()? "success":"fail";
	}
}
