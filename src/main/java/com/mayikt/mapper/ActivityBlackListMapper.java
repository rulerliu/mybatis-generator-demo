package com.mayikt.mapper;

import com.mtyikt.entity.ActivityBlackListPO;

public interface ActivityBlackListMapper {
    int deleteByPrimaryKey(Long blackListId);

    int insert(ActivityBlackListPO record);

    int insertSelective(ActivityBlackListPO record);

    ActivityBlackListPO selectByPrimaryKey(Long blackListId);

    int updateByPrimaryKeySelective(ActivityBlackListPO record);

    int updateByPrimaryKey(ActivityBlackListPO record);
}