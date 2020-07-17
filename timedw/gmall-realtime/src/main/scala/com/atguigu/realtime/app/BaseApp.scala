package com.atguigu.realtime.app

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
 * description: BaseApp 
 * date: 2020/7/17 14:51 
 * author: nogc
 * version: 1.0 
 */
trait BaseApp {
  def main(args: Array[String]): Unit = {
    //1、创建一个StreamingContext
    val conf: SparkConf = new SparkConf().setMaster("local[2]").setAppName("DauApp")
    val ssc = new StreamingContext(conf, Seconds(3))

    run(ssc)

    //2、开流
    ssc.start()
    //3、阻止main退出
    ssc.awaitTermination()
  }

  def run(ssc: StreamingContext): Unit
}
