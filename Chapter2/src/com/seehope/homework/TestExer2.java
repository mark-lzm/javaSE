package com.seehope.homework;

public class TestExer2 {
    public static void main(String[] args) {
        int x = 2; //周二
        int day = 100;
        x += (day%7)%7;
        System.out.print("今天是周二，100天后是周");
        switch (x){
            case 1:
                System.out.print("一");
                break;
            case 2:
                System.out.print("二");
                break;
            case 3:
                System.out.print("三");
                break;
            case 4:
                System.out.print("四");
                break;
            case 5:
                System.out.print("五");
                break;
            case 6:
                System.out.print("六");
                break;
            case 7:
                System.out.print("日");
                break;
        }
    }
}
