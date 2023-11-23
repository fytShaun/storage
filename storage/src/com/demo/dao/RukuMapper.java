package com.demo.dao;

import com.demo.vo.Ruku;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Ruku模块的DAO层（数据层）接口，提供增删改查等数据库操作的方法抽象
 */
@Mapper
public interface RukuMapper {
    /**
     * 增加入库表记录
     *
     * @param vo
     * @return
     */
    int doCreate(Ruku vo);

    /**
     * 根据主键id的集合，批量删除对应的入库表记录
     *
     * @param ids
     * @return
     */
    int doRemoveBatch(Collection<Serializable> ids);

    /**
     * 更新入库表记录
     *
     * @param vo
     * @return
     */
    int doUpdate(Ruku vo);

    /**
     * 根据主键id获取入库表记录的详情
     *
     * @param id
     * @return
     */
    Ruku findById(Serializable id);

    /**
     * 根据条件查询入库表集合
     *
     * @param params
     * @return
     */
    List<Ruku> findAllSplit(Map<String, Object> params);

    /**
     * 根据条件查询入库数量
     *
     * @param params
     * @return
     */
    Integer getAllCount(Map<String, Object> params);
}
