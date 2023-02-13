package com.course.testng;


import org.testng.annotations.*;
/*@BeforeMethod(在每一个测试方法之前运行的方法，执行整个类中如果有多个测试方法，则运行一个测试方法就执行一次BeforMethod)
 *@AfterMethod(在每一个测试方法之后运行的方法，执行整个类中如果有多个测试方法，则运行一个测试方法就执行一次AfterMethod)标签
 *@BeforeClass(在类运行之前运行的方法)
 *@AfterClass(在类运行之后运行的方法)标签
 *@BeforeSuite(测试套件：在类运行之前运行,>BforeClass)
 *@AfterSuite(测试套件:在类运行之后运行，>AfterClass)标签
 * Ps：suite可以包含多个class，类属于测试套件之下
 *@BeforeTest(在测试套件后执行，BeforeClass之前执行)
 *@AfterTest(在测试套件后执行，AfterClass之后执行)
 * */

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是第一个测试用例！【第5个】");
    }
    @Test
    public void testCase2(){
        System.out.println("这是第二个测试用例！【第8个】");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法之前运行的【第4个/第7个】");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是在测试方法之后运行的【第6个/第9个】");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println(("BeforeClass是在类运行之前运行的方法【第3个】"));
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法【第10个】");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件在类运行之前运行，>BeforeClass【第1个】");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件在类运行之后运行，>AfterClass【第12个】");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest【第2个】");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest【第11个】");

    }
}
