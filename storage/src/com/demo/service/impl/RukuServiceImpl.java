package com.demo.service.impl;

import com.demo.dao.RukuMapper;
import com.demo.service.RukuService;
import com.demo.vo.Ruku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Ruku模块的Service层（业务层）的具体实现类，对RukuService接口中定义的抽象方法作出具体的功能实现
 */
@Service
public class RukuServiceImpl implements RukuService {

    @Autowired
    private RukuMapper rukuMapper;


    //@Override
    public boolean insert(Ruku vo) {
        return this.rukuMapper.doCreate(vo) == 1;
    }

    //@Override
    public boolean delete(Collection<Serializable> ids) {
        return ids.isEmpty() ? false : this.rukuMapper.doRemoveBatch(ids) == ids.size();
    }

    //@Override
    public boolean update(Ruku vo) {
        return this.rukuMapper.doUpdate(vo) == 1;
    }

    //@Override
    public Ruku get(Serializable id) {
        return this.rukuMapper.findById(id);
    }

    //@Override
    public Map<String, Object> list(Map<String, Object> params) {
        Map<String, Object> resultMap = new HashMap();
        resultMap.put("totalCount", this.rukuMapper.getAllCount(params));
        resultMap.put("list", this.rukuMapper.findAllSplit(params));
        return resultMap;
    }
}
