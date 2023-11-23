package com.demo.service;

import com.demo.vo.Chuku;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * Chuku模块的Service层（业务层）接口，提供业务方法的抽象
 */
public interface ChukuService {
    /**
     * 增加出库
     *
     * @param vo
     * @return
     */
    boolean insert(Chuku vo);

    /**
     * 删除出库
     *
     * @param ids
     * @return
     */
    boolean delete(Collection<Serializable> ids);

    /**
     * 修改出库
     *
     * @param vo
     * @return
     */
    boolean update(Chuku vo);

    /**
     * 根据主键Id查询出库详情
     *
     * @param id
     * @return
     */
    Chuku get(Serializable id);

    /**
     * 根据条件查询出库的列表与数量
     *
     * @param params
     * @return
     */
    Map<String, Object> list(Map<String, Object> params);
}
