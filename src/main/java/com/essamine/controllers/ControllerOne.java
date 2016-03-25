package com.essamine.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.essamine.domain.Reservation;
import com.essamine.service.ReservationService;

@Controller
@RequestMapping("/reservation")
public class ControllerOne {

	@Autowired
	ReservationService reservationService;

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

//	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
//	public void methodteste(@PathVariable("name") String name) {
//
//		System.out.println("==>" + name);
//	}

}
