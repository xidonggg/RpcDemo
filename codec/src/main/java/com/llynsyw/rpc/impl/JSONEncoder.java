package com.llynsyw.rpc.impl;

import com.alibaba.fastjson.JSON;
import com.llynsyw.rpc.Encoder;

/**
 * @Description 基于JSON的序列化
 * @Author yanbin
 * @Date 2022/4/9
 **/
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
