package com.black.unicorn.demo.common.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
public class Page<T> implements Serializable {

    private static final long serialVersionUID = 3829041917830356021L;

    private Integer pageSize;

    private Integer pageNum;

    /**
     * 总记录数
     */
    private long totalCount = 0;

    /**
     * 对象列表
     */
    private List<T> resultList = new ArrayList<>();
}
