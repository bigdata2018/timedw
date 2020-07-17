package com.atguigu.realtime.bean

import java.text.SimpleDateFormat
import java.util.Date

/**
 * description: StartupLog 
 * date: 2020/7/15 12:20 
 * author: nogc
 * version: 1.0 
 */
case class StartupLog(mid: String,
                      uid: String,
                      appId: String,
                      area: String,
                      os: String,
                      channel: String,
                      logType: String,
                      version: String,
                      ts: Long,
                      var logDate: String = null,   // 年月日  2020-07-15
                      var logHour: String = null) { //小时  10
  private val date = new Date(ts)
  logDate = new SimpleDateFormat("yyyy-MM-dd").format(date)
  logHour = new SimpleDateFormat("HH").format(date)
}
