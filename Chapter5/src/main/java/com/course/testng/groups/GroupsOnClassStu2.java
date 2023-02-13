package com.course.testng.groups;

import org.testng.annotations.Test;
//类分组stu，在类上面写Test标签
@Test(groups = "stu")
public class GroupsOnClassStu2 {
    public void stu1(){
        System.out.println("GroupsOnClass2中的stu111执行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的stu222执行");
    }
}
