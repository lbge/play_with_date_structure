package com.example.fibonaccisearch;

/**
 * @author Linbo Ge
 * @date 2020/6/19 17:03
 * 斐波那契擦查找
 */
public class FibonacciSearch {


    public static void main(String[] args) {

    }


    static long[] fibonacci(int n) {
        if (n <= 1) {
            System.out.println("err");;
        }
        long[] arr = new long[n];
        arr[0] = arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];

        }
        return arr;
    }
}
