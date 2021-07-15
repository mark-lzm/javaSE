package com.seehope.shili;

import java.util.Scanner;

public class 用户登录 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        int password = sc.nextInt();
        String str = username.equals("admin")&&password==123?"登录成功":"登录失败，请确认账号密码";
        System.out.println(str);
    }
}
