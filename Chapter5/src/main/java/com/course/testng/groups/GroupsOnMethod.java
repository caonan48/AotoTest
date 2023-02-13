package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    //创建分组groups，把方法分组
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4444");
    }
    //把某组内的方法前后用以下注解的方法运行
    @BeforeGroups("server")
    public void beforeGroupesOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupesOnClient(){
        System.out.println("这是客户端端组运行之前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法");
    }
}
