package cn.llynsyw.rpc.example.server;

import cn.llynsyw.rpc.example.server.CalcService;
import cn.llynsyw.rpc.example.server.impl.CalcServiceImpl;
import cn.llynsyw.server.RpcServer;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author yanbin
 * @Date 2022/4/10
 **/
@Slf4j
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer();
        server.register(CalcService.class,new CalcServiceImpl());
        server.start();

    }
}
