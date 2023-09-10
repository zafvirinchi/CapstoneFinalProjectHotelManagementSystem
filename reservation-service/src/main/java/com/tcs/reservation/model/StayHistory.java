package com.tcs.reservation.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StayHistory {
	
	private int id;
	private int reservationID;
	private User user;
}
