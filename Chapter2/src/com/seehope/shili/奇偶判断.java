package com.seehope.shili;

import java.util.Scanner;

public class 奇偶判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("请输入一个数：");
        a = sc.nextInt();
        String str = a%2==0?"该数为偶数":"该数为奇数";
        System.out.println(str);
    }
}
