package com.example.dao;

import com.example.domain.City;

import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Short cityId);

    int insert(City record);

    City selectByPrimaryKey(Short cityId);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}