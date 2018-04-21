package com.zl.edu.redis;

import com.zl.edu.util.PropertiesUtil;
import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
import redis.clients.util.Hashing;
import redis.clients.util.Sharded;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/3/1.
 */
@Slf4j
public class RedisShardedPool {
    private static ShardedJedisPool pool;

    private static Integer maxTotal = Integer.parseInt(PropertiesUtil.getProperty("redis.max.total", "20"));//最大连接数
    private static Integer maxIdle = Integer.parseInt(PropertiesUtil.getProperty("redis.max.idea", "10"));//在jedispool中最大的空状态的jedis的实例的个数
    private static Integer minIdle = Integer.parseInt(PropertiesUtil.getProperty("redis.min.idea", "2"));//jedispool中最小的空闲状态的redis的实例的个数
    private static Boolean testOnBorrow = Boolean.parseBoolean(PropertiesUtil.getProperty("redis.test.borrow", "true"));// 在borrow一个jedis实例的时候，是否要进行验证操作，如果是ture，则得到的jedis实例肯定是可以用的。
    private static Boolean testOnReturn = Boolean.parseBoolean(PropertiesUtil.getProperty("redis.test.return", "true"));//在return个jedis实例的时候，是否要经行验证操作，如果赋值为ture，则返回的jedis实例肯定是可以用的。


    private final static String host1=PropertiesUtil.getProperty("redis.host1","127.0.0.1");
    private final static int port1=PropertiesUtil.getIntegerProperty("redis.port1",6379);
    private final static String host2=PropertiesUtil.getProperty("redis.host2","127.0.0.1");
    private final static int port2=PropertiesUtil.getIntegerProperty("redis.port2",6380);
    private static void initPool(){
        log.info("start init redis pool");
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMinIdle(minIdle);
        jedisPoolConfig.setTestOnBorrow(testOnBorrow);
        jedisPoolConfig.setTestOnReturn(testOnReturn);
        jedisPoolConfig.setBlockWhenExhausted(true);

        List<JedisShardInfo> shards=new ArrayList<>();
        JedisShardInfo info1=new JedisShardInfo(host1,port1);
        JedisShardInfo info2=new JedisShardInfo(host2,port2);
        shards.add(info1);
        shards.add(info2);
        pool=new ShardedJedisPool(jedisPoolConfig,shards, Hashing.MURMUR_HASH, Sharded.DEFAULT_KEY_TAG_PATTERN);
        log.info("init redis pool end");
    }

    public static ShardedJedis getResource(){
       return pool.getResource();
    }

    public static void returnResource(ShardedJedis jedis) {
        pool.returnResource(jedis);
    }

    public static void returnBrokenResource(ShardedJedis jedis) {
        pool.returnBrokenResource(jedis);
    }

}
