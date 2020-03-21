package com.example.reservation_service.dto;

import org.apache.ibatis.type.Alias;

@Alias("Data")
public class TestData {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
