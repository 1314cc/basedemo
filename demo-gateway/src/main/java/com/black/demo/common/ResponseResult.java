package com.black.demo.common;

import com.black.demo.enums.ReturnCodeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 3449934794766090510L;

    private int status = ReturnCodeEnum.RESTFUL_SUCCESS.value();
    
    private String message = ReturnCodeEnum.RESTFUL_SUCCESS.getDesc();

    private Date time;
    
    private T data;
}
