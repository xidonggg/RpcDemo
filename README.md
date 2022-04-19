# RpcDemo
手动实现rpc框架

主要分为6个模块
rpc-common：存放一些公用的工具类
rpc-codec：序列化模块
rpc-proto：协议模块（自定义协议）
rpc-transport：传输模块，实现http传输
rpc-server：服务端模块，主要是在manager中存放接口的实例
rpc-client：客户端模块，主要是通过动态代理实现接口访问的具体逻辑

rpc-server-demo：服务端对于rpc-server的应用
rpc-client-demo：客户端对于rpc-client的应用，实现对CalcService接口的访问
