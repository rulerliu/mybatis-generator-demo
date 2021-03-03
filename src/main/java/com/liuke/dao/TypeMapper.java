package com.liuke.dao;

import com.liuke.entity.Type;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}