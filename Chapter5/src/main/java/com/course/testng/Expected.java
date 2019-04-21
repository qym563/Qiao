package com.course.testng;

import org.testng.annotations.Test;

public class Expected {
    /**
     *
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个异常的测试");
        throw new RuntimeException();

    }
}
