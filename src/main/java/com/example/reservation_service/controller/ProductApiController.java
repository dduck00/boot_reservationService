package com.example.reservation_service.controller;

import com.example.reservation_service.dto.ProductsInfo;
import com.example.reservation_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ProductApiController {

	private final ProductService productService;

	@Autowired
	public ProductApiController(ProductService productService) {
		this.productService = productService;

	}

	@GetMapping("/products")
	public ProductsInfo responseProductsInfo(
		@RequestParam(name = "categoryId", required = false, defaultValue = "0") int categoryId,
		@RequestParam(name = "start", required = false, defaultValue = "0") int startIndex) {

		return productService.getProductsInfo(categoryId, startIndex);
	}

}
