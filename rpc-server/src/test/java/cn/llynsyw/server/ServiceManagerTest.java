package cn.llynsyw.server;

import cn.llynsyw.rpc.ReflectionUtils;
import cn.llynsyw.rpc.Request;
import cn.llynsyw.rpc.ServiceDescriptor;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ServiceManagerTest {

    ServiceManager sm;

    @Before
    public void init(){
        sm = new ServiceManager();
        TestInterface bean = new TestClass();
        sm.register(TestInterface.class,bean);
    }

    @Test
    public void register() {
        TestInterface bean = new TestClass();
        sm.register(TestInterface.class,bean);
    }

    @Test
    public void lookup() {
        Method method= ReflectionUtils.getPublicMethods(TestInterface.class)[0];
        ServiceDescriptor sdp = ServiceDescriptor.from(TestInterface.class,method);
        Request request = new Request();
        request.setService(sdp);

        ServiceInstance instance = sm.lookup(request);
        assertNotNull(instance);
    }
}