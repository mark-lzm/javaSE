package com.seehope.homework;

//为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
public class TestExer1 {
    public static void main(String[] args) {
        int hour = 89;
        int dayHour = 24;
        System.out.println("抵抗洪水，战士们共用了" + hour/dayHour + "天" +
                hour%dayHour +"小时");
    }
}
