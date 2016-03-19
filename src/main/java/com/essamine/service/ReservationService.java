package com.essamine.service;

import java.util.List;

import com.essamine.domain.Reservation;

public interface ReservationService {
	
	public List<Reservation> listReservation(String courtName);

}
