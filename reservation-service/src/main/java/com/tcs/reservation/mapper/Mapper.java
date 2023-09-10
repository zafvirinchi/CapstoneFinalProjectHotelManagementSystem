package com.tcs.reservation.mapper;

import com.tcs.reservation.dto.ReservationDto;
import com.tcs.reservation.entity.Reservation;

public interface Mapper {
	public Reservation convert(ReservationDto reservationDto);
}
