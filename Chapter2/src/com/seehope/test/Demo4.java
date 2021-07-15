package com.seehope.test;

public class Demo4 {
    public static void main(String[] args) {
        //自动转换
        int num1 = 1000;
        double num2 = 1000;  //自动转换
        System.out.println(num2);
        float num3 = 1000L;
        double num4 = 1000.3333f;  //小---->大 正确
//      float num5 =10000.3333;  大----->小 错误 不会发生自动转换

        int num6 = 98;
        num6 = 'a';
        System.out.println(num6);

        //强制类型转换
        int num7 = (int)1000.58;
        System.out.println(num7);
        System.out.println("num7:" + num7); //任何基本类型与字符串相加（连接），都会转换为字符串 num7自动转换为字符串

        byte num8 = (byte)264;
        System.out.println(num8);

        char num9 = (char)98;
        System.out.println(num9);

    }
}
