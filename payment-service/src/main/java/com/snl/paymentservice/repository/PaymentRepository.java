/**
 * 
 */
package com.snl.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snl.paymentservice.entity.Payment;

/**
 * @author sunil Jboss
 *
 */
@Repository
public interface PaymentRepository  extends JpaRepository<Payment, Integer>{

}
