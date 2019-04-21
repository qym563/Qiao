package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行了");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("afterTest运行了");
    }

}
