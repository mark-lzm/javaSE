package com.seehope.shili;

import java.util.Scanner;

public class 变量值交换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,temp;
        System.out.println("请输入第一个数：");
        a = sc.nextInt();
        System.out.println("请输入第二个数：");
        b = sc.nextInt();
        System.out.println("第一个数："+a+"\t第二个数："+b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("两个数字交换后：");
        System.out.println("第一个数："+a+"\t第二个数："+b);

    }
}
