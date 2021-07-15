package com.seehope.test;

public class Demo3 {
    public static void main(String[] args){
        int num2 = 0b1001; //二进制 数字前加0b或者0B
        System.out.println(num2);
        int num8 = 011;    //八进制 数字前加0
        System.out.println(num8);
        int num16 = 0x11; //十六进制 数字前加0x或者0X
        System.out.println(num16);

        float f1 = 10.123f; //默认小数是double类型 所以需要在小数之后＋f或者F
        double d1 = 3.14159;

        char c1 = 'a'; //需要用单引号‘’
        char c2 = '1'; //并且是单一个字符
        char c3 = '我';
        char c4 = '\n'; //转义字符

        String s = "abc"; //字符串  是类
        //ASCII码 A：65  a：97  A+32=a

        char c5 = 97;  //字符类型也可用用数字赋值
        System.out.println(c5);

        boolean flag = false; //只有true和false
        //flag = 100; //error 不匹配

        byte b1 = 127;
        short s1 = 10000;
        int i1 = 1000000000;
        long l1 = 100000000000000l; //需要数字后＋l或者L才是long类型
    }
}
