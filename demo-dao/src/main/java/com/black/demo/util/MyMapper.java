
package com.black.demo.util;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.provider.SpecialProvider;

import java.util.List;

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
