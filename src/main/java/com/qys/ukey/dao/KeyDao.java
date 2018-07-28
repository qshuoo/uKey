package com.qys.ukey.dao;

/**
 * Author : qiaoyongshuo
 * Date : 2018/7/28
 */
public interface KeyDao {

    /**
     * 插入dbid 表内容
     * @return 主键
     */
    String saveBDID();

    /**
     * 插入uuid表内容
     * @param id 主键
     * @return 受影响行数
     */
    int saveUUID(String id);

    /**
     * 插入snowflake表内容
     * @param id 主键
     * @return 受影响行数
     */
    int saveSnowflakeId(Long id);

}
