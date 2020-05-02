package com.example.dao;

import com.example.domain.Rental;

import java.util.List;

public interface RentalMapper {
    int deleteByPrimaryKey(Integer rentalId);

    int insert(Rental record);

    Rental selectByPrimaryKey(Integer rentalId);

    List<Rental> selectAll();

    int updateByPrimaryKey(Rental record);
}