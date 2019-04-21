package com.test.testng;

import org.testng.annotations.Test;

public class Expent {
    @Test(expectedExceptions = RuntimeException.class)
    public void expent(){
        System.out.println("这是异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void ex(){
        System.out.println("这是异常测试结果");
        throw new RuntimeException();
    }
}
