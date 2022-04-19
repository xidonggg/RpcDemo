# RpcDemo
手动实现rpc框架<br>

主要分为6个模块<br>
rpc-common：存放一些公用的工具类<br>
rpc-codec：序列化模块<br>
rpc-proto：协议模块（自定义协议)<br>
rpc-transport：传输模块，实现http传输<br>
rpc-server：服务端模块，主要是在manager中存放接口的实例<br>
rpc-client：客户端模块，主要是通过动态代理实现接口访问的具体逻辑<br>

rpc-server-demo：服务端对于rpc-server的应用<br>
rpc-client-demo：客户端对于rpc-client的应用，实现对CalcService接口的访问<br>
