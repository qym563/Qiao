package com.test.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Cat {
    @Test(groups = "cat1")
    public void cat(){
        System.out.println("猫");
    }
    @Test(groups = "dog1")
    public void dog(){
        System.out.println("狗");
    }
    @AfterGroups("cat1")
    public void afterGroups(){
        System.out.println("猫分组");
    }
    @BeforeGroups("cat1")
    public void beforeGroups(){
        System.out.println("猫分组");
    }
    @AfterGroups("dog1")
    public void afterGroups1(){
        System.out.println("狗分组");
    }
    @BeforeGroups("dog1")
    public void beforeGroups1(){
        System.out.println("狗分组");
    }
}
