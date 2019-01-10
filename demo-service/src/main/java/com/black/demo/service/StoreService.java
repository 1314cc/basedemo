package com.black.demo.service;

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
    long insert();

    /**
     * 修改
     * @return
     */
    long update();

    /**
     * 删除
     * @return
     */
    boolean delete();

    /**
     * search
     */
    boolean searchByPage();

}
