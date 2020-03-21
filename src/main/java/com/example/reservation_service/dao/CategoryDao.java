package com.example.reservation_service.dao;

import com.example.reservation_service.dto.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDao {
	List<Category> selectCategoryList();

	int selectCategoryCount();
}