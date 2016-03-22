package com.essamine.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.essamine.domain.Reservation;
import com.essamine.service.ReservationService;
import com.essamine.service.ReservationServiceImpl;

@Controller
@RequestMapping("/reservation")
public class ControllerOne {

	ReservationService reservationService = new ReservationServiceImpl();

	public ControllerOne() {
	}

	@RequestMapping(method = RequestMethod.GET)
	public String reservationQuery(Model model) {
		System.out.println("reservationQuery get");
		return "reservationQuery";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String reservationQuery(@RequestParam String courtName, Model model) {
		List<Reservation> RsQ = reservationService.listReservation(courtName);
		model.addAttribute("reservationsQ", RsQ);
		return "reservationQuery";
	}

}
