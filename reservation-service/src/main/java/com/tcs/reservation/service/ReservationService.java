package com.tcs.reservation.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tcs.reservation.dto.ReservationDto;
import com.tcs.reservation.entity.Reservation;
import com.tcs.reservation.exception.ReservationNotFoundException;
import com.tcs.reservation.model.ApiResponse;

public interface ReservationService {

	public ResponseEntity<ApiResponse<Reservation>> addReservation(ReservationDto reservation);

	public Reservation getReservationDetailsById(int anyInt) throws ReservationNotFoundException;

	public List<Reservation> getAllReservations();
	
	public Reservation cancelReservation(ReservationDto reservation,int anyInt);

}
