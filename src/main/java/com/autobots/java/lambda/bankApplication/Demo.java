package com.autobots.java.lambda.bankApplication;

public class Demo {
    public static void main(String[] args) {
        int result = sum(5, 6);
        System.out.println(result);
        String result1 = sum2(5, 6);
        System.out.println(result1);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String sum2(int a, int b) {
        return String.valueOf(a + b);
    }
}
