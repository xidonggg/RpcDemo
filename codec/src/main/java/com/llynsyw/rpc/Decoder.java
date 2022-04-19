package com.llynsyw.rpc;

/**
 * @Description 、
 * @Author yanbin
 * @Date 2022/4/9
 **/
public interface Decoder {
    <T> T decode(byte[] bytes,Class<T> clazz);
}
