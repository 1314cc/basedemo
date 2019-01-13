package com.black.unicorn.demo.dao.mapper;

import com.black.unicorn.demo.dao.model.Store;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface StoreMapper extends Mapper<Store> {

    List<Store> selectByTime(@Param("startDate") Date start,@Param("endDate") Date end);
}