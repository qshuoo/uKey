package com.qys.ukey.dao.impl;

import com.qys.ukey.dao.KeyDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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
        String sql = "insert into dbid (name) values ('key')";

        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                return  preparedStatement;
            }
        }, holder);

        return holder.getKey().toString();
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
