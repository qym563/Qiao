package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组test1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是--客户端组test3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是--客户端组test4");
    }
    @BeforeGroups("server")
    public void beforeGroupOnserver(){
        System.out.println("这是服务端组运行前");
    }
    @AfterGroups("server")
    public void afterGroupOnserver(){
        System.out.println("这是服务端组运行后");
    }
    @BeforeGroups("client")
    public void beforeGroupOnclient(){
        System.out.println ("这是--客户端组运行前");
    }
    @AfterGroups("client")
    public void afterGroupOnclient(){
        System.out.println("这是--客户端组运行后");
    }
}
