package com.example.reservation_service.controller;

import com.example.reservation_service.dto.CategorysInfo;
import com.example.reservation_service.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class CategoryApiController {

	private final CategoryService categoryService;

	@Autowired
	public CategoryApiController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping("/categories")
	public CategorysInfo responseCategorysInfo() {
		return categoryService.getCategorysInfo();
	}

}
