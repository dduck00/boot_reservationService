package com.example.reservation_service.dao;

import com.example.reservation_service.dto.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductDao {
	List<Product> selectProductList(@Param("id") int categoryId, @Param("start") int start, @Param("limit") int limit);

	int selectProductCount(@Param("id") int categoryId);
}