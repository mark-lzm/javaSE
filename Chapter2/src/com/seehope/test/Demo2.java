package com.seehope.test;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("-----------1.變量的聲明-----------");
        int age; //變量的聲明
        double num; //float,double
        //int num1,num2,num3;     //同一行聲明多個變量
        age = 18;     //賦值
        num = 3.14159; //類型要匹配
        //變量的賦值
        System.out.println("-----------2.變量的聲明與賦值合併-----------");

        int score = 98; //變量與賦值合併為一步
        int num1=10,num2,num3=20;   //同一行聲明及賦值多個變量，也可不賦值
        double num4=10.1,num5,num6=10.2; //同意函聲明及賦值多個變量，也可不賦值

        System.out.println("-----------3.變量的使用-----------");
        //(1)直接輸出
        System.out.println(age);
        //(2)給其他變量賦值
        num2=num1;
        System.out.println(num2);
        //(3)參與運算
        num2=num1+num3;
        System.out.println(num2);

        //變量使用前必須先聲明與賦值
    }
}
