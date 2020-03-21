package com.example.reservation_service.controller;

import com.example.reservation_service.dto.PromotionsInfo;
import com.example.reservation_service.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class PromotionApiController {

	private final PromotionService promotionService;

	@Autowired
	public PromotionApiController(PromotionService promotionService) {
		this.promotionService = promotionService;

	}

	@GetMapping("/promotions")
	public PromotionsInfo reponsePromotionsInfo() {
		return promotionService.getPromotionsInfo();
	}

}