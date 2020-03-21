package com.example.reservation_service.service.impl;

import com.example.reservation_service.dao.ProductDao;
import com.example.reservation_service.dto.ProductsInfo;
import com.example.reservation_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	private static final int MAX_PRODUCT_SHOW_COUNT = 4;

	private final ProductDao productDao;

	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public int getProductCount(int categoryId) {
		return productDao.selectProductCount(categoryId);
	}

	@Override
	public ProductsInfo getProductsInfo(int categoryId, int startProductIndex) {

		if (isValidCategory(categoryId) == false) {
			throw new IllegalArgumentException("wrong category id : " + categoryId);
		}

		ProductsInfo productsInfo = new ProductsInfo();

		productsInfo.setItems(productDao.selectProductList(categoryId, startProductIndex, MAX_PRODUCT_SHOW_COUNT));
		productsInfo.setTotalCount(getProductCount(categoryId));

		return productsInfo;
	}

	private boolean isValidCategory(int categoryId) {
		return categoryId >= 0;
	}
}