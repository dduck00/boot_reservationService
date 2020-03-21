package com.example.reservation_service.dao;

import com.example.reservation_service.dto.Promotion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PromotionDao {
	List<Promotion> selectPromotionList();
}
