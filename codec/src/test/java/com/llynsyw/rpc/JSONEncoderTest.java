package com.llynsyw.rpc;

import com.llynsyw.rpc.impl.JSONEncoder;
import org.junit.Test;

import static org.junit.Assert.*;

public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();
        TestBean bean = new TestBean();
        bean.setName("lly");
        bean.setAge(22);
        byte[] bytes = encoder.encode(bean);

        assertNotNull(bytes);
    }
}