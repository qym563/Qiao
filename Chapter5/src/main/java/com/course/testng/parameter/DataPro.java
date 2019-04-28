package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro{
    @Test(dataProvider = "data")
    public void testDataProvdier(String name,int age){
        System.out.println("name"+name+"age"+age);
    }
    @DataProvider(name = "data")
    public Object [][] proddata(){
        Object[][] o = new Object[][]{
                {"张三","17"},
                {"王五","18"}
        };
        return o;
    }
}
