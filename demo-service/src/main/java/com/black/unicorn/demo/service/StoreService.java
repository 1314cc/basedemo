package com.black.unicorn.demo.service;

import com.black.unicorn.demo.gateway.view.request.StoreRequest;

/**
 * @Author: chen
 * @Description:
 * @Date: 2019/1/10 下午11:19
 */
public interface StoreService {
    /**
     * 新增
     * @return
     */
    long insertOrUpdate(StoreRequest storeRequest);

    /**
     * 删除
     * @return
     */
    boolean deleteByPrimaryKey(long id);

    /**
     * search
     */
    boolean searchByPage();

}
