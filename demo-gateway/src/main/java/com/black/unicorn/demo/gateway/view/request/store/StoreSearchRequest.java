package com.black.unicorn.demo.gateway.view.request.store;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Author: chen
 * @Description:
 * @Date: 2019/1/11 上午10:10
 */

@Getter
@Setter
@ToString
public class StoreSearchRequest {
    /**
     * 店铺id,自增
     */
    private Long id;

    /**
     * 店铺名称
     */
    @NotNull(message = "storeName不能为空")
    @Length(max = 128, message = "店铺名称不能超过128位")
    @ApiParam(value = "店铺名称", required = true)
    private String storeName;

    /**
     * 店铺描述
     */
    @NotNull(message = "storeDesc不能为空")
    @Length(max = 256, message = "店铺名称不能超过256位")
    @ApiParam(value = "店铺描述", required = true)
    private String storeDesc;


    /**
     * 首字母
     */
    @NotNull(message = "storeFirstLetter不能为空")
    @Length(max = 1, message = "店铺名称不能超过1位")
    @ApiParam(value = "首字母", required = true)
    private String storeFirstLetter;

    /**
     * 商场id
     */
    @NotNull(message = "mallId不能为空")
    @Length(max = 11, message = "店铺名称不能超过11位")
    @ApiParam(value = "商场id", required = true)
    private String mallId;


    /**
     * 楼层
     */
    @NotNull(message = "floorNo不能为空")
    @Length(max = 8, message = "店铺名称不能超过8位")
    @ApiParam(value = "楼层", required = true)
    private String floorNo;

    /**
     * 地图区域id
     */
    @NotNull(message = "mapAreaId不能为空")
    @ApiParam(value = "地图区域id", required = true)
    private String mapAreaId;

    /**
     * 店铺系统关联ID
     */
    @NotNull(message = "shopId不能为空")
    @ApiParam(value = "店铺系统关联ID", required = true)
    private String shopId;

    /**
     * 分类风格展示
     */
    @NotNull(message = "categoryDisplay不能为空")
    @ApiParam(value = "分类风格展示", required = true)
    private String categoryDisplay;

    /**
     * 展位号
     */
    @NotNull(message = "positionNo不能为空")
    @Length(max = 32,message = "展位号不能超过32位")
    @ApiParam(value = "展位号", required = true)
    private String positionNo;

    /**
     * 权重,默认为0
     */
    @ApiParam(value = "权重,默认为0", required = false)
    @Min(0)
    @Max(9999999)
    private Integer weights;

    /**
     * 创建人
     */
    @ApiParam(value = "创建人", required = false)
    private String createBy;

    /**
     * 更新人
     */
    @ApiParam(value = "更新人", required = false)
    private String updateBy;
}
