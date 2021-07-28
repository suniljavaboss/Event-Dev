/**
 * 
 */
package com.snl.orderservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.snl.orderservice.common.TransectionRequest;
import com.snl.orderservice.common.TransectionResponse;
import com.snl.orderservice.entity.Order;
import com.snl.orderservice.model.Payment;
import com.snl.orderservice.repository.OrderRepository;
import com.snl.orderservice.service.OrderService;

/**
 * @author sunil Jboss
 *
 */

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderRepository;
    @Autowired
    private RestTemplate restTemplate;
	
	
	@Override
	public TransectionResponse doOrders(TransectionRequest request) {
		String response="";
		Order order=request.getOrder();
		Payment payment=request.getPayment();
		payment.setOrderId(order.getOrderId());
		payment.setAmount(order.getPrice());
		//rest call
		Payment paymentResponse=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		response=paymentResponse.getPaymentStatus().equals("success")? "payment succussecefull":"Payment fail";
		orderRepository.save(order);
		
		return new TransectionResponse(order,paymentResponse.getTransectionId(),paymentResponse.getAmount(),response);
	}
}
