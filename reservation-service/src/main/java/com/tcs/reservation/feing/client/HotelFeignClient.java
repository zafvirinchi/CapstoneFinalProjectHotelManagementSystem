package com.tcs.reservation.feing.client;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tcs.reservation.model.ApiResponse;
import com.tcs.reservation.model.Hotel;

@FeignClient (name = "HOTEL-SERVICE")
@LoadBalancerClient(name = "HOTEL-SERVICE")
public interface HotelFeignClient {
	@GetMapping("/v1/api/hotels/name/{name}")
	ApiResponse<Hotel> getHotelsByName(@PathVariable String name);
}

