package cn.llynsyw.rpc;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ReflectionUtilsTest {

    @Test
    public void newInstance() {
        TestClass testClass = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(testClass);
    }

    @Test
    public void getPublicMethods() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(1,publicMethods.length);

        String name = publicMethods[0].getName();

        assertEquals("c",name);
    }

    @Test
    public void invoke() {
        Method[] publicMethods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method b  = publicMethods[0];

        TestClass t = new TestClass();

        Object res = ReflectionUtils.invoke(t,b);
        assertEquals("c",res);
    }
}