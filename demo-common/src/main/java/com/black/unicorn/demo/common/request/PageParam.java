package com.black.unicorn.demo.common.request;

import com.black.unicorn.demo.common.constants.CommonConstants;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @Author: chen
 * @Description:
 * @Date: 2019/1/12 下午2:38
 */
@ToString
@Getter
@Setter
public class PageParam {
    @NotNull(message = "pageNum不能为空")
    @ApiParam(value = "pageNum", required = true)
    private Integer pageNum = 1;

    @NotNull(message = "pageSize不能为空")
    @ApiParam(value = "pageSize", required = true)
    private Integer pageSize = 10;

    public void limitScale(){
        if(pageNum > CommonConstants.MAX_PAGE_NUM){
            pageNum = CommonConstants.MAX_PAGE_NUM;
        }

        if(pageSize > CommonConstants.MAX_PAGE_SIZE){
            pageSize = CommonConstants.MAX_PAGE_SIZE;
        }
    }
}
