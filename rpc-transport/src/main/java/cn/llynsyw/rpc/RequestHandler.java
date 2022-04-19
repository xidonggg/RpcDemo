package cn.llynsyw.rpc;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description TODO
 * @Author yanbin
 * @Date 2022/4/9
 **/
public interface RequestHandler {
    void onRequestSteam(InputStream receive, OutputStream toResponse);
}
