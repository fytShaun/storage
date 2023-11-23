package com.demo.service.impl;

import com.demo.dao.KuchunMapper;
import com.demo.service.KuchunService;
import com.demo.vo.Kuchun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Kuchun模块的Service层（业务层）的具体实现类，对KuchunService接口中定义的抽象方法作出具体的功能实现
 */
@Service
public class KuchunServiceImpl implements KuchunService {

    @Autowired
    private KuchunMapper kuchunMapper;


    //@Override
    public boolean insert(Kuchun vo) {
        return this.kuchunMapper.doCreate(vo) == 1;
    }

    //@Override
    public boolean delete(Collection<Serializable> ids) {
        return ids.isEmpty() ? false : this.kuchunMapper.doRemoveBatch(ids) == ids.size();
    }

    //@Override
    public boolean update(Kuchun vo) {
        return this.kuchunMapper.doUpdate(vo) == 1;
    }

    //@Override
    public Kuchun get(Serializable id) {
        return this.kuchunMapper.findById(id);
    }

    //@Override
    public Map<String, Object> list(Map<String, Object> params) {
        Map<String, Object> resultMap = new HashMap();
        resultMap.put("totalCount", this.kuchunMapper.getAllCount(params));
        resultMap.put("list", this.kuchunMapper.findAllSplit(params));
        return resultMap;
    }
}
