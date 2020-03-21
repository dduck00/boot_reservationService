package com.example.reservation_service.service.impl;

import com.example.reservation_service.dao.TestDao;
import com.example.reservation_service.dto.TestData;
import com.example.reservation_service.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestDao testDao;

    @Autowired
    TestServiceImpl(TestDao testDao){
        this.testDao = testDao;
    }

    @Override
    public List<TestData> getTestData() {
        return testDao.selectTestData();
    }
}
