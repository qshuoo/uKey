package com.qys.ukey.id.db;

import com.qys.ukey.dao.KeyDao;
import com.qys.ukey.id.IKeyProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author : qiaoyongshuo
 * Date : 2018/7/29
 */
@Slf4j
@Service("dbKeyProducer")
public class DBKeyProducer implements IKeyProducer {

    @Resource
    private KeyDao keyDao;

    @Override
    public void producer() {
        long start = System.currentTimeMillis();
        String key = keyDao.saveBDID();
        long end = System.currentTimeMillis();
        log.info("DBID get key {}, time is {} ms", key, end - start);
    }
}
