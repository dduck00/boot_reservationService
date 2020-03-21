package com.example.reservation_service.controller;

import com.example.reservation_service.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class ReservationApiController {

	private ReservationService reservationService;

	@Autowired
	public ReservationApiController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@PutMapping("/reservation")
	public boolean cancelReservation(@RequestBody int id,
		@CookieValue(value = "email") String email) {
		reservationService.cancelReservation(id, email);
		return true;
	}
}
