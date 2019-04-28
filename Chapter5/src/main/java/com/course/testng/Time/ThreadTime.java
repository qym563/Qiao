package com.course.testng.Time;

import org.testng.annotations.Test;

public class ThreadTime {
    @Test(timeOut = 1000)
    public void Thread() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("this");
    }
}
