package com.demo.service;

import com.demo.vo.Ruku;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * Ruku模块的Service层（业务层）接口，提供业务方法的抽象
 */
public interface RukuService {
    /**
     * 增加入库
     *
     * @param vo
     * @return
     */
    boolean insert(Ruku vo);

    /**
     * 删除入库
     *
     * @param ids
     * @return
     */
    boolean delete(Collection<Serializable> ids);

    /**
     * 修改入库
     *
     * @param vo
     * @return
     */
    boolean update(Ruku vo);

    /**
     * 根据主键Id查询入库详情
     *
     * @param id
     * @return
     */
    Ruku get(Serializable id);

    /**
     * 根据条件查询入库的列表与数量
     *
     * @param params
     * @return
     */
    Map<String, Object> list(Map<String, Object> params);
}
