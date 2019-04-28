package com.course.testng.parameter;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class DataProvider {
    @Test(dataProvider = "data")
    public void testDataProvdier(String name, int age) {
        System.out.println("name:" + name + "---" + "age:");
    }
    @org.testng.annotations.DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"张三", 10},
                {"李四", 30},
                {"李s", 30},
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("Test1方法---name:" + name + "---" + "age:");
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("Test2方法---name:" + name + "---" + "age:");
    }
    @org.testng.annotations.DataProvider(name = "methodData")
    public Object[][] providerData1(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"张三", 30},
                    {"李四", 40},
                    {"李s", 50}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"王三", 30},
                    {"王四", 40},
                    {"王s", 50}
            };
        }

        return result;
    }
    }

