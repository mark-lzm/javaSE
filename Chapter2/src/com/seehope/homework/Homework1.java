package com.seehope.homework;

public class Homework1 {
    public static void main(String[] args) {
        //使用三目运算符 求两个变量中的最大值
        int a = 50;
        int b = 60;
        int max = a>b?a:b; //三目运算符：如果a>b为true则返回a，否则返回b
        System.out.println("两个数中的最大值是："+max);
        //使用三目运算符 求三个变量中的最大值
        int num1 = 300;
        int num2 = 80;
        int num3 = 400;
        //先求强两个的最大值
        int temp = num1>num2?num1:num2;
        //上述结构再跟第三个数字比较
        int max3 = temp>num3?temp:num3;
        System.out.println("三个数中的最大值是：" + max3);

        //判断大象与长颈鹿谁高，输出“大象比长颈鹿高多少cm”或者“长颈鹿比大象高多少cm”
        int xiang = 180;
        int lu =380;
        String stage = xiang>lu?"大象比长颈鹿高"+(xiang-lu)+"cm":"长颈鹿比大象高"+(lu-xiang)+"cm";
        System.out.println(stage);
    }
}
