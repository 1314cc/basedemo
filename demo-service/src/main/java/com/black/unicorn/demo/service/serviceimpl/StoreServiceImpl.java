package com.black.unicorn.demo.service.serviceimpl;

import com.black.unicorn.demo.common.util.BeanUtils;
import com.black.unicorn.demo.dao.mapper.StoreMapper;
import com.black.unicorn.demo.dao.model.Store;
import com.black.unicorn.demo.gateway.view.request.StoreRequest;
import com.black.unicorn.demo.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: chen
 * @Description:
 * @Date: 2019/1/10 下午11:19
 */
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreMapper storeMapper;


    @Override
    public long insertOrUpdate(StoreRequest storeRequest) {

        Store store = BeanUtils.transfrom(Store.class, storeRequest);
        long result = 0;
        if (store.getId() != null && store.getId() != 0) {
            result  = storeMapper.updateByPrimaryKey(store);
        } else {
            storeMapper.insertSelective(store);
            result = store.getId();
        }
        return result;
    }

    @Override
    public boolean deleteByPrimaryKey(long id) {
        int result = storeMapper.deleteByPrimaryKey(id);
        if(result > 0 ){
            return true;
        }
        return false;
    }

    @Override
    public boolean searchByPage() {
        return false;
    }
}
