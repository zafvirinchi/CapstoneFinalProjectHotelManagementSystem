package com.tcs.reservation.feing.client;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.reservation.model.Payment;

@FeignClient(name = "PAYMENT-SERVICE")
@LoadBalancerClient(name = "PAYMENT-SERVICE")
public interface PaymentFeignClient {
	@PostMapping("/v1/api/payments")
	public ResponseEntity<Payment> addPayment(@RequestBody Payment paymentDto);
}
