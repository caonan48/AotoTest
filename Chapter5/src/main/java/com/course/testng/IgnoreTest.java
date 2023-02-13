package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }
    //忽略此方法测试，enabled=false
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 不执行");
    }
    //加了enabled=true和不加是一样的效果，不加默认是true
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}
