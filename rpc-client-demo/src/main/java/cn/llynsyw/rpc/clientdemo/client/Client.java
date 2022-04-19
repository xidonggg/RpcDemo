package cn.llynsyw.rpc.clientdemo.client;

import cn.llynsw.rpc.client.impl.RpcClient;
import cn.llynsyw.rpc.example.server.CalcService;

public class Client {
    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);

        int r1 = service.add(1,2);
        int r2 = service.minus(10,8);

        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + r2);
    }
}
