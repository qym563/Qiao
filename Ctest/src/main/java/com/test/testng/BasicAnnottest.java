package com.test.testng;
import org.testng.annotations.*;

public class BasicAnnottest {
    @Test
    public void tcase(){
        System.out.println("第一个");
    }
    @BeforeMethod
    public void tcase1(){
        System.out.println("before");
    }
    @AfterMethod
    public void tcase2(){
        System.out.println("after");
    }
    @BeforeClass
    public void tcase3(){
        System.out.println("Beforeclass");
    }
    @AfterClass
    public void tcase4(){
        System.out.println("AfterClass");
    }
    @BeforeSuite
    public void tcase5(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void tcase6(){
        System.out.println("AfterSuite");
    }
}
