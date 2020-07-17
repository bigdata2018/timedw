package com.atguigu.realtime.gmallpublisher;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description: GmallPublisherApplicatior
 * date: 2020/7/17 16:05
 * author: nogc
 * version: 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.realtime.gmallpublisher.mapper")
public class GmallPublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPublisherApplication.class, args);
    }

}
