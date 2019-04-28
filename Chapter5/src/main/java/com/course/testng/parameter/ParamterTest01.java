package com.course.testng.parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest01 {
    @Test
    @Parameters({"name","age"})
    public void testDataProvider(String name,int age) {
        System.out.println("name=" + name + ":" + age);
    }
}