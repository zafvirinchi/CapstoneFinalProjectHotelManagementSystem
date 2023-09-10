package com.tcs.reservation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Room {
	
	private int id;
	private int roomNumber;
	private String roomStatus;
	private Boolean isActive;
	private RoomType roomType;
	

}
