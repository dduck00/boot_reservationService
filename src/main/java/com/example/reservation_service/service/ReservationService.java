package com.example.reservation_service.service;

import com.example.reservation_service.dto.ReservationInfo;

import java.util.List;
import java.util.Map;

public interface ReservationService {
	void addReservation(ReservationInfo reservationInfo);

	void cancelReservation(int id, String email);

	Map<String, List<ReservationInfo>> getReservationMap(String email);

}
