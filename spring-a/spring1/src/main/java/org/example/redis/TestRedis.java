package org.example.redis;

import redis.clients.jedis.Jedis;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/8 16:11
 */
public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.80.134" , 6379);
        jedis.auth("admin");
        System.out.println(jedis.ping());
    }

}
