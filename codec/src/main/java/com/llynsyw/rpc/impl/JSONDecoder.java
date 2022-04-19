package com.llynsyw.rpc.impl;

import com.alibaba.fastjson.JSON;
import com.llynsyw.rpc.Decoder;

/**
 * @Description TODO
 * @Author yanbin
 * @Date 2022/4/9
 **/
public class JSONDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes,Class<T> clazz) {
        return JSON.parseObject(bytes,clazz);
    }
}
