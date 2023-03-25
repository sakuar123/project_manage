package com.sakura.project_manage.mapper.provider;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;

import tk.mybatis.mapper.annotation.RegisterMapper;

/**
 * @author 李七夜
 * @version 1.0
 * Created by 李七夜 on 2020/6/2 11:55
 */
@RegisterMapper
public interface IgnoreInsertMapper<T> {

    /**
     * ignore 插入
     */
    @InsertProvider(type = IgnoreInsertProvider.class, method = "dynamicSQL")
    int ignoreInsert(T record);

    @InsertProvider(type = IgnoreInsertProvider.class, method = "dynamicSQL")
    int ignoreInsertSelective(T record);

    @InsertProvider(type = IgnoreInsertProvider.class, method = "dynamicSQL")
    int ignoreInsertList(List<T> recordList);
}
