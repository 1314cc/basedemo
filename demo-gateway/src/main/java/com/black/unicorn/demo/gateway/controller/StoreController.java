package com.black.unicorn.demo.gateway.controller;

import com.black.unicorn.demo.common.enums.ReturnCodeEnum;
import com.black.unicorn.demo.common.request.store.StoreRequest;
import com.black.unicorn.demo.common.request.store.StoreSearchRequest;
import com.black.unicorn.demo.common.response.Page;
import com.black.unicorn.demo.common.response.ResponseResult;
import com.black.unicorn.demo.dao.model.Store;
import com.black.unicorn.demo.service.StoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Api(value = "Store")
@RestController
@RequestMapping("/store")
public class StoreController extends BaseComtroller {

    @Autowired
    private StoreService storeService;

    @ApiOperation(value = "新增Store", notes = "新增Store")
    @PostMapping("/insert")
    public ResponseResult insertStore(@RequestBody @Valid StoreRequest storeRequest) {
        long id = storeService.insertOrUpdate(storeRequest);
        return ResponseResult.success(id);
    }


    @ApiOperation(value = "修改Store", notes = "修改Store")
    @PostMapping("/edit/{id}")
    public ResponseResult editStore(@PathVariable(value = "id") Long id, @RequestBody @Valid StoreRequest storeRequest) {
        storeRequest.setId(id);
        long result = storeService.insertOrUpdate(storeRequest);
        return ResponseResult.success(result);
    }

    @ApiOperation(value = "详情Store", notes = "详情Store")
    @PostMapping("/info/{id}")
    public ResponseResult<Store> infoStore(@PathVariable(value = "id") long id) {
        Store store = storeService.getById(id);
        return ResponseResult.success(store);
    }

    @ApiOperation(value = "删除Store", notes = "删除Store")
    @DeleteMapping("/delete/{id}")
    public ResponseResult editStore(@PathVariable(value = "id") Long id) {
        boolean result = storeService.deleteByPrimaryKey(id);
        return ResponseResult.success(result);
    }


    @ApiOperation(value = "查找Store", notes = "查找Store")
    @GetMapping("/search")
    public ResponseResult<Page<Store>> searchStore(@Valid StoreSearchRequest storeSearchRequest) {

        ReturnCodeEnum returnCodeEnum = storeSearchRequest.validate();
        if (returnCodeEnum != ReturnCodeEnum.PARAM_VALIDATION_SUCCESS) {
            return ResponseResult.buildResponse(returnCodeEnum);
        }
        Page<Store> result = storeService.searchStoreByPage(storeSearchRequest);
        return ResponseResult.success(result);
    }


    @ApiOperation(value = "查找Store", notes = "查找Store")
    @GetMapping("/selectByTime")
    public ResponseResult<List<Store>> selectByTime(@Valid StoreSearchRequest storeSearchRequest) {

        ReturnCodeEnum returnCodeEnum = storeSearchRequest.validate();
        if (returnCodeEnum != ReturnCodeEnum.PARAM_VALIDATION_SUCCESS) {
            return ResponseResult.buildResponse(returnCodeEnum);
        }
        List<Store> result = storeService.selectByTime(storeSearchRequest.getCreateTimeFrom(), storeSearchRequest.getCreateTimeTo());
        return ResponseResult.success(result);
    }

}
