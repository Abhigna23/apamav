package com.example;

public class EvenOdd {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 7;
        System.out.println(n + (isEven(n) ? " is Even" : " is Odd"));
    }
}