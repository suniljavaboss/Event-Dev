/**
 * 
 */
package com.snl.orderservice.service;

import org.springframework.stereotype.Component;

import com.snl.orderservice.common.TransectionRequest;
import com.snl.orderservice.common.TransectionResponse;

/**
 * @author sunil Jboss
 *
 */
@Component
public interface OrderService  {
   
	public TransectionResponse doOrders(TransectionRequest request);
}
