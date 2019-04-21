package com.test.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Config {
    public Config(){}
    @BeforeSuite
    public void befterMethod(){
        System.out.println("befMethod");
    }
    @AfterSuite
    public void afterMethod(){
        System.out.println("afterMethod");
    }
    @BeforeTest(enabled = false)
    public void befterTest(){
        System.out.println("befterTest");
    }
    @AfterTest(enabled = false)
    public void afterTest(){
        System.out.println("afterTest");
    }

}
