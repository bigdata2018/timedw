package com.atguigu.realtime.gmallpublisher.mapper;

import java.util.List;
import java.util.Map;

/**
 * description: OrderMapper
 * date: 2020/7/17 16:10
 * author: nogc
 * version: 1.0
 */
public interface OrderMapper {
    Double getTotalAmount(String date);
    List<Map<String,Object>> getHourAmount(String date);
}
