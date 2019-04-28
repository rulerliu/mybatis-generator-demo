package com.mayikt.mapper;

import com.mayikt.entity.ActivityBlackList;

public interface ActivityBlackListMapper {
    int deleteByPrimaryKey(Long blackListId);

    int insert(ActivityBlackList record);

    int insertSelective(ActivityBlackList record);

    ActivityBlackList selectByPrimaryKey(Long blackListId);

    int updateByPrimaryKeySelective(ActivityBlackList record);

    int updateByPrimaryKey(ActivityBlackList record);
}