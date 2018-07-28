package com.qys.ukey.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Author : qiaoyongshuo
 * Date : 2018/7/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class KeyDaoTest {

    @Resource
    private KeyDao keyDao;

    @Test
    public void saveUUIDTest() {
        String id = UUID.randomUUID().toString();
        int i = keyDao.saveUUID(id);
        Assert.assertEquals(1, i);
    }

}
