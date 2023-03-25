package com.sakura.project_manage.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.entity.AuthorityDetail;
import com.sakura.project_manage.mapper.generator.AuthorityDetailGeneratorMapper;
import com.sakura.project_manage.service.AuthorityDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/11 16:34
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityDetailServiceImpl implements AuthorityDetailService {

    @Autowired
    private AuthorityDetailGeneratorMapper authorityDetailGeneratorMapper;

    @Override
    public List<AuthorityDetail> list() {
        List<AuthorityDetail> list = authorityDetailGeneratorMapper.selectAll();
        // 操作所有的数据
        // 通过Collectors.groupingBy(Address::getPid)方法按照Pid进行分组，也就是将pid相同的放在一起
        Map<Integer, List<AuthorityDetail>> map = list.stream()
                .collect(Collectors.groupingBy(AuthorityDetail::getParentId));
        System.out.println(JSON.toJSONString(map));
        // 循环addresses,给它设置children属性
        list.forEach(authorityDetail -> authorityDetail.setAuthorityDetailList(map.get(authorityDetail.getId())));
        // 现在已经形成了多棵树，最后我们再通过filter()方法挑选出根节点的那颗树即可。 这里我的根节点的pid为0
        return list.stream().filter(authorityDetail -> authorityDetail.getParentId().equals(0))
                .collect(Collectors.toList());
    }

    @Override
    public Boolean conserve(AuthorityDetail authorityDetail) {
        try {
            authorityDetailGeneratorMapper.insertSelective(authorityDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException("新增权限失败!");
        }
    }

    @Override
    public Boolean modify(AuthorityDetail authorityDetail) {
        try {
            authorityDetailGeneratorMapper.updateByPrimaryKeySelective(authorityDetail);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ErrorException("修改权限失败!");
        }
    }
}
