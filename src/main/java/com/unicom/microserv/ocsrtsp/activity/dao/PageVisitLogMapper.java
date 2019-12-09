package com.unicom.microserv.ocsrtsp.activity.dao;

import com.unicom.microserv.ocsrtsp.activity.po.PageVisitLog;

public interface PageVisitLogMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(PageVisitLog record);

    int insertSelective(PageVisitLog record);

    PageVisitLog selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(PageVisitLog record);

    int updateByPrimaryKey(PageVisitLog record);
}