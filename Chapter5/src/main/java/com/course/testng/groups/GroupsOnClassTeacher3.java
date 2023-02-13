package com.course.testng.groups;

import org.testng.annotations.Test;
//类分组teacher，在类上面写Test标签
@Test(groups = "teacher")
public class GroupsOnClassTeacher3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher111执行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher222执行");
    }
}
