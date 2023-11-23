package com.demo.dao;

import com.demo.vo.Kuchun;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Kuchun模块的DAO层（数据层）接口，提供增删改查等数据库操作的方法抽象
 */
@Mapper
public interface KuchunMapper {
    /**
     * 增加库存表记录
     *
     * @param vo
     * @return
     */
    int doCreate(Kuchun vo);

    /**
     * 根据主键id的集合，批量删除对应的库存表记录
     *
     * @param ids
     * @return
     */
    int doRemoveBatch(Collection<Serializable> ids);

    /**
     * 更新库存表记录
     *
     * @param vo
     * @return
     */
    int doUpdate(Kuchun vo);

    /**
     * 根据主键id获取库存表记录的详情
     *
     * @param id
     * @return
     */
    Kuchun findById(Serializable id);

    /**
     * 根据条件查询库存表集合
     *
     * @param params
     * @return
     */
    List<Kuchun> findAllSplit(Map<String, Object> params);

    /**
     * 根据条件查询库存数量
     *
     * @param params
     * @return
     */
    Integer getAllCount(Map<String, Object> params);
}
