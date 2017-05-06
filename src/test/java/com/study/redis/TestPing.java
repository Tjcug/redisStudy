package com.study.redis;

import redis.clients.jedis.Jedis;

public class TestPing {
	public static void main(String[] args) 
	{
		Jedis jedis = new Jedis("root2",6379);
		System.out.println(jedis.ping());
	}
}
