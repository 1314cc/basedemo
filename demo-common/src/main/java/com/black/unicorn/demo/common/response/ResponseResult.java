package com.black.unicorn.demo.common.response;

import com.black.unicorn.demo.common.enums.ReturnCodeEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
@Builder
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = 3449934794766090510L;

    private int status = ReturnCodeEnum.RESTFUL_SUCCESS.value();
    
    private String message = ReturnCodeEnum.RESTFUL_SUCCESS.getDesc();

    private Date time;
    
    private T data;


    public static <T> ResponseResult<T> success(T data){
        return ResponseResult.<T>builder()
                .data(data)
                .message(ReturnCodeEnum.RESTFUL_SUCCESS.getDesc())
                .status(ReturnCodeEnum.RESTFUL_SUCCESS.value())
                .time(new Date())
                .build();
    }

    public static <T> ResponseResult<T> ret400(T data){
        return ResponseResult.<T>builder()
                .data(data)
                .message(ReturnCodeEnum.RESTFUL_REQUEST_OBJECT_INVALID.getDesc())
                .status(ReturnCodeEnum.RESTFUL_REQUEST_OBJECT_INVALID.value())
                .time(new Date())
                .build();
    }

    public static <T> ResponseResult<T> ret500(T data){
        return ResponseResult.<T>builder()
                .data(data)
                .message(ReturnCodeEnum.RESTFU_FAIL.getDesc())
                .status(ReturnCodeEnum.RESTFU_FAIL.value())
                .time(new Date())
                .build();
    }
}
