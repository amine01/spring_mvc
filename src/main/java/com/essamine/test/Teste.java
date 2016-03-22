package com.essamine.test;

import com.essamine.service.ReservationService;
import com.essamine.service.ReservationServiceImpl;

public class Teste {

	public static void main(String[] args) {
		ReservationService reservationService=new ReservationServiceImpl();
		System.out.println(reservationService.listReservation("Walo").get(0).getPlayer().getName());

	}

}
