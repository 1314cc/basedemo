package com.black.unicorn.demo.common.request.store;

import com.black.unicorn.demo.common.constants.CommonConstants;
import com.black.unicorn.demo.common.enums.ReturnCodeEnum;
import com.black.unicorn.demo.common.request.PageParam;
import com.black.unicorn.demo.common.util.DateUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @Author: chen
 * @Description:
 * @Date: 2019/1/11 上午10:10
 */

@Getter
@Setter
@ToString
@ApiModel(description = "店铺搜索")
public class StoreSearchRequest extends PageParam {


    /**
     * 店铺名称
     */
    @Length(max = 128, message = "店铺名称不能超过128位")
    @ApiModelProperty(value = "店铺名称", required = false)
    private String storeName;

    /**
     * 首字母
     */
    @Length(max = 1, message = "店铺名称不能超过1位")
    @ApiModelProperty(value = "首字母", required = false)
    private String storeFirstLetter;

    /**
     * 商场id
     */
    @Length(max = 11, message = "店铺名称不能超过11位")
    @ApiModelProperty(value = "商场id", required = false)
    private String mallId;

    /**
     * 楼层
     */
    @Length(max = 8, message = "店铺名称不能超过8位")
    @ApiModelProperty(value = "楼层", required = false)
    private String floorNo;


    @ApiModelProperty(value = "创建时间-From", required = false)
    private Date createTimeFrom;

    @ApiModelProperty(value = "创建时间-To", required = false)
    private Date createTimeTo;

    public ReturnCodeEnum validate() {
        super.limitScale();

        if (createTimeTo != null && createTimeFrom != null) {
            if (DateUtil.getDayGap(createTimeFrom, createTimeTo) > CommonConstants.MAX_DATA_GAP) {
                    return ReturnCodeEnum.PARAM_DATA_VALIDATION_INVALID;
            }
        }
        return ReturnCodeEnum.PARAM_VALIDATION_SUCCESS;
    }

}
