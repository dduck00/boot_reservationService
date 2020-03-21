package com.example.reservation_service.service.impl;


import com.example.reservation_service.dao.DisplayDao;
import com.example.reservation_service.dto.Display;
import com.example.reservation_service.dto.DisplayReserve;
import com.example.reservation_service.service.CommentService;
import com.example.reservation_service.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.stereotype.Service;

@Service
public class DisplayServiceImpl implements DisplayService {

	private final DisplayDao displayDao;
	private final CommentService commentService;

	@Autowired
	public DisplayServiceImpl(DisplayDao displayDao, CommentService commentService) {
		this.displayDao = displayDao;
		this.commentService = commentService;
	}

	@Override
	public Display getDisplay(int displayId) {

		if (isValidDisplayId(displayId) == false) {
			throw new IllegalArgumentException("displayId is a negative quantity : " + displayId);
		}

		Display display = new Display();

		display.setDisplayInfo(displayDao.selectDisplayInfo(displayId));
		display.setDisplayInfoImage(displayDao.selectDisplayInfoImage(displayId));

		if (display.getDisplayInfo() == null) {
			throw new DataRetrievalFailureException("there is no display ** " + displayId);
		}

		int productId = display.getDisplayInfo().getProductId();

		display.setProductImages(displayDao.selectProductImageList(productId));
		display.setProductPrices(displayDao.selectProductPriceList(productId));

		display.setComments(commentService.getCommentInfoList(productId, true));
		display.setAverageScore(
			(display.getComments().size() != 0) ? displayDao.selectDisplayCommentAverage(productId) : 0);

		return display;
	}

	@Override
	public DisplayReserve getDisplayReservation(int displayId) {
		if (isValidDisplayId(displayId) == false) {
			throw new IllegalArgumentException("displayId is a negative quantity : " + displayId);
		}

		DisplayReserve displayReserve = new DisplayReserve();

		displayReserve.setDisplayInfo(displayDao.selectDisplayInfo(displayId));

		if (displayReserve.getDisplayInfo() == null) {
			throw new DataRetrievalFailureException("there is no display ** " + displayId);
		}

		int productId = displayReserve.getDisplayInfo().getProductId();

		displayReserve.setProductImages(displayDao.selectProductImageList(productId));
		displayReserve.setProductPrices(displayDao.selectProductPriceList(productId));

		return displayReserve;
	}

	private boolean isValidDisplayId(int displayId) {
		return displayId > 0;
	}

}