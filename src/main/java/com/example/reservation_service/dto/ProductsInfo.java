package com.example.reservation_service.dto;

import java.util.List;

public class ProductsInfo {

	private List<Product> items;
	private int totalCount;

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
		this.items = items;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

}
