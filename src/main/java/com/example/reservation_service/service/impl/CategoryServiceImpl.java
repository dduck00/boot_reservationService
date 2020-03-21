package com.example.reservation_service.service.impl;

import com.example.reservation_service.dao.CategoryDao;
import com.example.reservation_service.dto.CategorysInfo;
import com.example.reservation_service.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	private final CategoryDao categoryDao;

	@Autowired
	public CategoryServiceImpl(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	@Override
	public CategorysInfo getCategorysInfo() {
		CategorysInfo categoryInfo = new CategorysInfo();
		categoryInfo.setItems(categoryDao.selectCategoryList());
		return categoryInfo;
	}

}