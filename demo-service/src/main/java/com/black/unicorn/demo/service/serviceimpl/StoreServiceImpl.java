package com.black.unicorn.demo.service.serviceimpl;

import com.black.unicorn.demo.common.request.store.StoreRequest;
import com.black.unicorn.demo.common.request.store.StoreSearchRequest;
import com.black.unicorn.demo.common.response.Page;
import com.black.unicorn.demo.common.util.BeanUtils;
import com.black.unicorn.demo.dao.mapper.StoreMapper;
import com.black.unicorn.demo.dao.model.Store;
import com.black.unicorn.demo.service.StoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

import java.util.List;

/**
 * @Author: chen
 * @Description:
 * @Date: 2019/1/10 下午11:19
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreMapper storeMapper;


    @Override
    public long insertOrUpdate(StoreRequest storeRequest) {

        Store store = BeanUtils.transfrom(Store.class, storeRequest);
        long result;
        if (store.getId() != null && store.getId() != 0) {
            result = storeMapper.updateByPrimaryKey(store);
        } else {
            storeMapper.insertSelective(store);
            result = store.getId();
        }
        return result;
    }

    @Override
    public Store getById(long id) {
        return storeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteByPrimaryKey(long id) {
        int result = storeMapper.deleteByPrimaryKey(id);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Page<Store> searchStoreByPage(StoreSearchRequest storeSearchRequest) {
        Weekend<Store> weekend = Weekend.of(Store.class);
        WeekendCriteria<Store, Object> criteria = weekend.weekendCriteria();
        if (StringUtils.isNotBlank(storeSearchRequest.getStoreName())) {
            criteria.andLike(Store::getStoreName, "%" + storeSearchRequest.getStoreName() + "%");
        }
        if (StringUtils.isNotBlank(storeSearchRequest.getStoreFirstLetter())) {
            criteria.andEqualTo(Store::getStoreFirstLetter, storeSearchRequest.getStoreFirstLetter());
        }
        if (StringUtils.isNotBlank(storeSearchRequest.getStoreFirstLetter())) {
            criteria.andEqualTo(Store::getStoreFirstLetter, storeSearchRequest.getStoreFirstLetter());
        }
        if (StringUtils.isNotBlank(storeSearchRequest.getMallId())) {
            criteria.andEqualTo(Store::getMallId, storeSearchRequest.getMallId());
        }
        if (StringUtils.isNotBlank(storeSearchRequest.getFloorNo())) {
            criteria.andEqualTo(Store::getFloorNo, storeSearchRequest.getFloorNo());
        }
        if (StringUtils.isNotBlank(storeSearchRequest.getFloorNo())) {
            criteria.andEqualTo(Store::getFloorNo, storeSearchRequest.getFloorNo());
        }
        if (ObjectUtils.allNotNull(storeSearchRequest.getCreateTimeFrom(), storeSearchRequest.getCreateTimeTo())) {
            criteria.andGreaterThanOrEqualTo(Store::getCreateTime, storeSearchRequest.getCreateTimeFrom())
                    .andLessThan(Store::getCreateTime, storeSearchRequest.getCreateTimeTo());
        }
        weekend.orderBy("crateTime").desc();
        PageHelper.offsetPage(storeSearchRequest.getPageNum(), storeSearchRequest.getPageSize());

        List<Store> storeList = storeMapper.selectByExample(weekend);
        PageInfo<Store> page = new PageInfo<>(storeList);
        return Page.<Store>builder().pageNum(storeSearchRequest.getPageNum()).pageSize(storeSearchRequest.getPageSize())
                .resultList(storeList).totalCount(page.getTotal()).build();
    }
}
