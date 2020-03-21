package com.example.reservation_service.dao;

import com.example.reservation_service.dto.ReservationInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReservationDao {
	int insertReservationInfo(ReservationInfo reservationInfo);

	int insertReservationInfoPrice(ReservationInfo reservationInfo);

	List<ReservationInfo> selectReservationList(String email);

	int updateReservationCancel(@Param("id") int id, @Param("email") String email);

}
