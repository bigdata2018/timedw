package com.atguigu.realtime.gmallpublisher.mapper;

import java.util.List;
import java.util.Map;

/**
 * description: DauMapper
 * date: 2020/7/17 16:09
 * author: nogc
 * version: 1.0
 */
public interface DauMapper {
    Long getDau(String date);

    List<Map<String,Object>> getHourDau(String date);
}
