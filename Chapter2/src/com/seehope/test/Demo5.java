package com.seehope.test;

public class Demo5 {
    public static void main(String[] args) {
        //作用域
        int num1 = 10;
        System.out.println("第一次输出num1:" + num1); //正确
        {
            int num2 = 100;
            System.out.println("第一次输入num2：" + num2);
            System.out.println("第二次输入num1：" + num1);
        }
        //System.out.println("第二次输入num2:" + num2);  error
        System.out.println("第三次输入num1：" + num1);

        //常量
        final double PI = 3.14159;  //只能赋值一次，不能再赋值
//      PI = 3.1415926;  error
        System.out.println(PI);

    }
}
