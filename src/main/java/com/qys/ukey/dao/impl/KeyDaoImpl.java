package com.qys.ukey.dao.impl;

import com.qys.ukey.dao.KeyDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Author : qiaoyongshuo
 * Date : 2018/7/28
 */

@Repository
public class KeyDaoImpl implements KeyDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public String saveBDID() {
        return null;
    }

    @Override
    public int saveUUID(String id) {
        String sql = "insert into uuid (id, name) values (?, 'key')";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int saveSnowflakeId(Long id) {
        String sql = "insert into snowflake_id (id, name) values (?, 'key')";
        return jdbcTemplate.update(sql, id);
    }
}
