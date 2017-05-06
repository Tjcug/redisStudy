package com.basic.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * locate com.basic.redis
 * Created by 79875 on 2017/5/6.
 * Jedis API 测试API
 */
public class RedisAPI {

    private Jedis jedis=new Jedis("root2",6379);

    @Test
    public void TestPing(){
        System.out.println(jedis.ping());
    }

    @Test
    public void TestString(){
        jedis.set("name","tanjie");
        jedis.set("age","123456");
        Set<String> keys = jedis.keys("*");
        System.out.printf(keys.toString());
    }
}
