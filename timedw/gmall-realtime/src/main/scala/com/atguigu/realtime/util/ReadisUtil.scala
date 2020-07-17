package com.atguigu.realtime.util

import redis.clients.jedis.{Jedis, JedisPool, JedisPoolConfig}

/**
 * description: ReadisUtil 
 * date: 2020/7/15 11:07 
 * author: nogc
 * version: 1.0 
 */
object ReadisUtil {
  private val conf = new JedisPoolConfig
  conf.setMaxTotal(100)
  conf.setMaxIdle(30) //最大空闲数
  conf.setMinIdle(10)
  conf.setBlockWhenExhausted(true) //用尽线程阻塞
  conf.setMaxWaitMillis(10000)
  conf.setTestOnCreate(true)
  conf.setTestOnBorrow(true) //检测池里连接的可用性
  conf.setTestOnReturn(true)

  private val pool = new JedisPool(conf, "hadoop102", 8000)

  def getClient={
    pool.getResource
  }

  def main(args: Array[String]): Unit = {
    val client: Jedis = getClient
    client.set("k3","redis3")
    client.close()
  }
}
