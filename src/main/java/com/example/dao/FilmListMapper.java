package com.example.dao;

import com.example.domain.FilmList;

import java.util.List;

public interface FilmListMapper {
    int insert(FilmList record);

    List<FilmList> selectAll();
}