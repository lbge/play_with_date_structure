package com.example.binarysearch;

import java.util.Scanner;

/**
 * @author L
 * 折半查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {23,44,56,78,98,123,435,654,865,999,2345};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int i = scanner.nextInt();
        binarySearch(list, i);
    }


    static void binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
//            int mid = (low + high)/2;
            /*防止相加之和越界*/
//            int mid = low + (high - low) / 2;
            /*效率更高*/
            int mid = low + (high - low) * (key - a[low])/(a[high] - a[low]);
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println("not found");
    }
}
