package com.tcs.reservation.feing.client;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tcs.reservation.model.ApiResponse;
import com.tcs.reservation.model.User;

@FeignClient(name = "GUEST-SERVICE")
@LoadBalancerClient(name = "GUEST-SERVICE")
public interface GuestFeignClient {

	@GetMapping("/v1/api/users/username/{username}")
	ResponseEntity<ApiResponse<User>> getUserByUserName(@PathVariable String username);
}
