package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
/*
* 测试套件配置，公共的写到这里*/
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
}
