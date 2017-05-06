package com.basic.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * locate com.basic.redis
 * Created by 79875 on 2017/5/6.
 */
public class RedisTest {

    @Test
    public void TestPing(){
        Jedis jedis=new Jedis("root4",6379);
        System.out.println(jedis.ping());
    }
}
