package com.example.reservation_service.service.impl;

import com.example.reservation_service.dao.PromotionDao;
import com.example.reservation_service.dto.PromotionsInfo;
import com.example.reservation_service.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionServiceImpl implements PromotionService {

	private final PromotionDao promotionDao;

	@Autowired
	public PromotionServiceImpl(PromotionDao promotionDao) {
		this.promotionDao = promotionDao;
	}

	@Override
	public PromotionsInfo getPromotionsInfo() {
		PromotionsInfo promotionsInfo = new PromotionsInfo();
		promotionsInfo.setItems(promotionDao.selectPromotionList());
		return promotionsInfo;
	}

}
