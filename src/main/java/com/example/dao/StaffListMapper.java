package com.example.dao;

import com.example.domain.StaffList;

import java.util.List;

public interface StaffListMapper {
    int insert(StaffList record);

    List<StaffList> selectAll();
}