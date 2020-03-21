package com.example.reservation_service.service;

import com.example.reservation_service.dto.Display;
import com.example.reservation_service.dto.DisplayReserve;

public interface DisplayService {
	Display getDisplay(int displayId);

	DisplayReserve getDisplayReservation(int displayId);
}
