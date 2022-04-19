package cn.llynsyw.rpc.example.server.impl;

import cn.llynsyw.rpc.example.server.CalcService;

/**
 * @Description TODO
 * @Author yanbin
 * @Date 2022/4/10
 **/
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
