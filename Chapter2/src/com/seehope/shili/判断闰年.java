package com.seehope.shili;

import java.util.Scanner;

public class 判断闰年 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        String str =(year%4==0&&year%100!=0)||year%400==0 ? "是闰年！":"不是闰年！";
        System.out.println(str);

    }
}
