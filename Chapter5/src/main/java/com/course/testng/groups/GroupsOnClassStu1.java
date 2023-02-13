package com.course.testng.groups;

import org.testng.annotations.Test;
//类分组stu，在类上面写Test标签
@Test(groups = "stu")
public class GroupsOnClassStu1 {
    public void stu1(){
        System.out.println("GroupsOnClass1里面的stu111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1里面的stu222运行");
    }
}
