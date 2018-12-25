package com.shxy.test;

public class Algorithm {

    public static int f(int a, int b, int c) {
        int res = 0;//1
        if (a > 0 && b > 0) {//2.1 2.2
            res += 1;//3
        }
        if (a > 1 && c > 0) {//4.1 4.2
            res += 1;//5
        }
        res += c;//6
        return res;//7
    }
}
