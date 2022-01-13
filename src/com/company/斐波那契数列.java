package com.company;

public class 斐波那契数列 {
    public static void main(String[] args) {


    }

    public int Fibonacci(int n) {
        int r = 0;
        int ling = 0;
        int yi = 1;
        if (n==0)
            return ling;
        if (n==1)
            return yi;
        for(int i=2;i<=n;i++){
             r = ling +yi;
             ling = yi;
             yi = r;
        }
        return r;

    }
}
