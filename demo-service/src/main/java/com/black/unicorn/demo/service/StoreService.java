package com.black.unicorn.demo.service;


import com.black.unicorn.demo.common.request.store.StoreRequest;
import com.black.unicorn.demo.common.request.store.StoreSearchRequest;
import com.black.unicorn.demo.common.response.Page;
import com.black.unicorn.demo.dao.model.Store;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: chen
 * @Description:
 * @Date: 2019/1/10 下午11:19
 */
@Service
public interface StoreService {
    /**
     * 新增
     * @return
     */
    long insertOrUpdate(StoreRequest storeRequest);


    /**
     * 详细信息
     */
    Store getById(long id);

    /**
     * 删除
     * @return
     */
    boolean deleteByPrimaryKey(long id);

    /**
     * search
     */
    Page<Store> searchStoreByPage(StoreSearchRequest storeSearchRequest);


    List<Store> selectByTime(Date startTime , Date endTime);
}
