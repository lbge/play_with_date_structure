package com.example.sequentialsearch;

import java.util.Scanner;

/**
 * @author L
 * 顺序表查找
 */
public class SequentialSearch {

    public static void main(String[] args) {
        int[] list = {12, 4, 4, 34, 655, 3656, 344, 4566, 245, 576};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int i = scanner.nextInt();
//        search(list, i);
        search2(list, i);
    }


    static void search(int[] a, int key) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println(i);
            }
        }
        System.out.println("not found");
    }

    /**
     * 哨兵模式的顺序查找
     *
     * @param a   数组
     * @param key 要查找的值
     */
    static void search2(int[] a, int key) {
        int i = a.length - 1;
        int min = a[0];
        a[0] = key;
        while (a[i] != key) {
            i--;
        }
        if (min == key) {
            System.out.println(0);
        } else if (i == 0) {
            System.out.println("not found");
        } else {
            System.out.println(i);
        }
    }

}
