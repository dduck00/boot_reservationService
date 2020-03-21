package com.example.reservation_service.dao;

import com.example.reservation_service.dto.TestData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {
    List<TestData> selectTestData();
}
