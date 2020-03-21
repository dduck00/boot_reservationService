package com.example.reservation_service.service;

import com.example.reservation_service.dto.CommentInfo;
import com.example.reservation_service.dto.CommentList;
import com.example.reservation_service.dto.FileInfo;

import java.util.List;

public interface CommentService {

	CommentList getCommentList(int productId);

	List<CommentInfo> getCommentInfoList(int productId, boolean isDetailPage);

	double getCommentAverage(List<CommentInfo> commentList);

	void addComment(FileInfo fileInfo, CommentInfo commentInfo);
}
