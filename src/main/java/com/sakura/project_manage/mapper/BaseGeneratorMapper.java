package com.sakura.project_manage.mapper;

import com.sakura.project_manage.mapper.provider.IgnoreInsertMapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 李七夜 on 2020/5/14 15:11
 * @author 李七夜
 */
public interface BaseGeneratorMapper<T> extends Mapper<T>, MySqlMapper<T>, IgnoreInsertMapper<T> {

}
