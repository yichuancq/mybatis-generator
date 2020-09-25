package com.example.dao;

import com.example.domain.PatrolPointDoTask;
import java.util.List;

public interface PatrolPointDoTaskMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(PatrolPointDoTask record);

    PatrolPointDoTask selectByPrimaryKey(String uuid);

    List<PatrolPointDoTask> selectAll();

    int updateByPrimaryKey(PatrolPointDoTask record);
}