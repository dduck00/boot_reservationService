package com.example.reservation_service.service;

import com.example.reservation_service.dto.ProductsInfo;

public interface ProductService {
	int getProductCount(int category);

	ProductsInfo getProductsInfo(int categoryId, int startProductIndex);
}