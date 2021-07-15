package com.seehope.test;

import java.util.Scanner;

public class Demo6_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        int a,b;
        System.out.print("请输入第一个数字：");
        a = scanner.nextInt();
        System.out.println("你输入的第一个数字是：" + a);
        System.out.print("请输入第二个数字：");
        b = scanner.nextInt();
        System.out.println("你输入的第二个数字是：" + b);
        int temp;
        temp = a>b?a:b;
        System.out.println("你输入两个数最大值为："+temp);*/

/*
        System.out.print("请输入第一个字符串：");
        String s1 = scanner.next();
        System.out.println(s1);
*/

        System.out.print("请输入第一个字符串：");
        String s2 = scanner.nextLine();
        System.out.println(s2);

    }
}
