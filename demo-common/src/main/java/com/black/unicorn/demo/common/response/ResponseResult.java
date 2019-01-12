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
//
//    public static <T> ResponseResultBuilder<T> builder() {
//        return new ResponseResultBuilder<>();
//    }

    public static <T> ResponseResult<T> success(){
        return success(null);
    }

    public static <T> ResponseResult<T> ret400(){
        return ret400(null);
    }

    public static <T> ResponseResult<T> ret500(){
        return ret500(null);
    }

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


    public static <T> ResponseResult<T> buildResponse(ReturnCodeEnum returnCodeEnum, T data) {
       return  ResponseResult.<T>builder()
                .data(data)
                .message(returnCodeEnum.getDesc())
                .status(returnCodeEnum.value())
                .time(new Date())
                .build();
    }

    public static <T> ResponseResult<T> buildResponse(ReturnCodeEnum returnCodeEnum) {
        return  ResponseResult.<T>builder()
                .data(null)
                .message(returnCodeEnum.getDesc())
                .status(returnCodeEnum.value())
                .time(new Date())
                .build();
    }
}

//
//class ResponseResultBuilder<T> {
//    private int status;
//    private String message;
//    private T data;
//    private Date time;
//
//    public ResponseResultBuilder<T> status(int status) {
//        this.status = status;
//        return this;
//    }
//
//    public ResponseResultBuilder<T> message(String message) {
//        this.message = message;
//        return this;
//    }
//
//    public ResponseResultBuilder<T> data(T data) {
//        this.data = data;
//        return this;
//    }
//
//
//    public ResponseResultBuilder<T> time(Date time) {
//        this.time = time;
//        return this;
//    }
//
//    public ResponseResult<T> build() {
//        ResponseResult<T> response = new ResponseResult<>();
//        response.setData(data);
//        response.setMessage(message);
//        response.setStatus(status);
//        response.setTime(time);
//        return response;
//    }
//}