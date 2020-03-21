package com.example.reservation_service.controller;

import com.example.reservation_service.dto.TestData;
import com.example.reservation_service.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/hello")
    public List<TestData> test(){
        return testService.getTestData();
    }
}
