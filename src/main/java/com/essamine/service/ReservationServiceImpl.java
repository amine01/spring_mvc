package com.essamine.service;

import java.util.ArrayList;
import java.util.List;

import com.essamine.domain.Player;
import com.essamine.domain.Reservation;
import com.essamine.domain.SportType;

public class ReservationServiceImpl implements ReservationService {

	public static final SportType tennis = new SportType(1, "Tennis");
	public static final SportType basket = new SportType(2, "Basket Ball");
	private List<Reservation> reservations;

	public ReservationServiceImpl() {
		reservations = new ArrayList<Reservation>();
		reservations.add(new Reservation("Walo", new Player("Hamed", "06324185477"), tennis));
		reservations.add(new Reservation("Salo", new Player("Zitouni", "0311415477"), basket));
	}

	public List<Reservation> listReservation(String courtName) {
		List<Reservation> resv = new ArrayList<Reservation>();
		for (Reservation reservation : reservations) {
			if (reservation.getCourtName().equals(courtName)) {
				resv.add(reservation);
			}
		}
		return resv;
	}
}
