package com.course.testng.multiThread;
import org.testng.annotations.Test;

public class MTest {
    @Test
    public void test01() {
        for (int x = 0; x < 10; x++) {
            System.out.println(Thread.currentThread().getId());
        }
    }
    @Test
    public void test02(){
        System.out.println(Thread.currentThread().getId());
    }
}
