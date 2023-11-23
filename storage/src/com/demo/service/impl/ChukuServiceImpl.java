package com.demo.service.impl;

import com.demo.dao.ChukuMapper;
import com.demo.service.ChukuService;
import com.demo.vo.Chuku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Chuku模块的Service层（业务层）的具体实现类，对ChukuService接口中定义的抽象方法作出具体的功能实现
 */
@Service
public class ChukuServiceImpl implements ChukuService {

    @Autowired
    private ChukuMapper chukuMapper;


    //@Override
    public boolean insert(Chuku vo) {
        return this.chukuMapper.doCreate(vo) == 1;
    }

    //@Override
    public boolean delete(Collection<Serializable> ids) {
        return ids.isEmpty() ? false : this.chukuMapper.doRemoveBatch(ids) == ids.size();
    }

    //@Override
    public boolean update(Chuku vo) {
        return this.chukuMapper.doUpdate(vo) == 1;
    }

    //@Override
    public Chuku get(Serializable id) {
        return this.chukuMapper.findById(id);
    }

    //@Override
    public Map<String, Object> list(Map<String, Object> params) {
        Map<String, Object> resultMap = new HashMap();
        resultMap.put("totalCount", this.chukuMapper.getAllCount(params));
        resultMap.put("list", this.chukuMapper.findAllSplit(params));
        return resultMap;
    }
}
