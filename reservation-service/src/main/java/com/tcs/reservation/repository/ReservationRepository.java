package com.tcs.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.reservation.entity.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}

