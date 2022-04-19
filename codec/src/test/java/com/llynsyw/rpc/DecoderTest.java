package com.llynsyw.rpc;

import com.llynsyw.rpc.impl.JSONDecoder;
import com.llynsyw.rpc.impl.JSONEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DecoderTest {

    @Test
    public void decode() {
        TestBean bean = new TestBean();
        Encoder encoder = new JSONEncoder();
        Decoder decoder = new JSONDecoder();
        bean.setName("lly");
        bean.setAge(22);
        byte[] bytes = encoder.encode(bean);

        TestBean bean2 = decoder.decode(bytes,TestBean.class);
        assertEquals(bean.getName(),bean2.getName());
        assertEquals(bean.getAge(),bean2.getAge());

    }
}