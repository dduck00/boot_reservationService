package com.example.reservation_service.dao;


import com.example.reservation_service.dto.CommentImage;
import com.example.reservation_service.dto.CommentInfo;
import com.example.reservation_service.dto.FileInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentDao {

	List<CommentInfo> selectCommentInfoList(@Param("id") int productId, @Param("isDetailPage") boolean isDetailPage);

	List<CommentImage> selectCommentImageList(@Param("id") int commentId);

	String selectProductDescription(@Param("id") int productId);

	void insertFile(FileInfo fileInfo);

	void insertComment(CommentInfo commentInfo);

	void insertCommentImage(CommentInfo commentInfo);
}
