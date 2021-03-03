package com.liuke.dao;

import com.liuke.entity.BookCustomerRel;

public interface BookCustomerRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookCustomerRel record);

    int insertSelective(BookCustomerRel record);

    BookCustomerRel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookCustomerRel record);

    int updateByPrimaryKey(BookCustomerRel record);
}