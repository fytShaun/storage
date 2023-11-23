package com.demo.service;

import com.demo.vo.Kuchun;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * Kuchun模块的Service层（业务层）接口，提供业务方法的抽象
 */
public interface KuchunService {
    /**
     * 增加库存
     *
     * @param vo
     * @return
     */
    boolean insert(Kuchun vo);

    /**
     * 删除库存
     *
     * @param ids
     * @return
     */
    boolean delete(Collection<Serializable> ids);

    /**
     * 修改库存
     *
     * @param vo
     * @return
     */
    boolean update(Kuchun vo);

    /**
     * 根据主键Id查询库存详情
     *
     * @param id
     * @return
     */
    Kuchun get(Serializable id);

    /**
     * 根据条件查询库存的列表与数量
     *
     * @param params
     * @return
     */
    Map<String, Object> list(Map<String, Object> params);
}
