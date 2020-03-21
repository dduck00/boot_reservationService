package com.example.reservation_service.dao;

import com.example.reservation_service.dto.DisplayInfo;
import com.example.reservation_service.dto.DisplayInfoImage;
import com.example.reservation_service.dto.ProductImage;
import com.example.reservation_service.dto.ProductPrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DisplayDao {

	DisplayInfo selectDisplayInfo(@Param("id") int displayId);

	DisplayInfoImage selectDisplayInfoImage(@Param("id") int displayId);

	List<ProductPrice> selectProductPriceList(@Param("id") int productId);

	List<ProductImage> selectProductImageList(@Param("id") int productId);

	double selectDisplayCommentAverage(@Param("id") int productId);
}
