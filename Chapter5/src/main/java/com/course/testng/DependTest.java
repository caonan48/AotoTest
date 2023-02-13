package com.course.testng;

import org.testng.annotations.Test;
/*
* 目前都是属性的学习*/
public class DependTest {
//先执行test1，如果test1失败了，test2就不执行
    @Test
    public void test1(){
        System.out.println("test1 run");
//        抛出运行时异常
        throw new RuntimeException();
    }
/*
*使用dependsOnMethod属性后面跟上依赖的方法名，执行test2会把test1和test2都执行
* 如果test1执行失败，则test2会被忽略不执行。
* 比如：登录后才能买东西，登录都失败了，买东西自然不执行
*/
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}

