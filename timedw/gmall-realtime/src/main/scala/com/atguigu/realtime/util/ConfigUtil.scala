package com.atguigu.realtime.util

import java.io.InputStream
import java.util.Properties

/**
 * description: ConfigUtil 
 * date: 2020/7/15 10:59 
 * author: nogc
 * version: 1.0 
 */
object ConfigUtil {
  def getProperty(fileName:String,name:String)={
    val is: InputStream = ConfigUtil.getClass.getClassLoader.getResourceAsStream(fileName)
    val ps = new Properties()
    ps.load(is)
    ps.getProperty(name)
  }

  def main(args: Array[String]): Unit = {
    println(getProperty("config.properties","group.id"))
  }
}
