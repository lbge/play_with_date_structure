package com.example.quicksort;

import java.util.Arrays;

/**
 * @author Linbo Ge
 * @date 2020/6/21 15:33
 * 递归法快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 4, 7, 3, 2, 9, 1, 6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


    private static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        int index;
        if (low < high) {
            index = getIndex(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {

        //三项取中划分
        int mid = low + (high - low) / 2;
        if (arr[low] > arr[high]) {
            swap(arr, low, high);
        }
        if (arr[mid] > arr[high]) {
            swap(arr, mid, high);
        }
        if (arr[mid] > arr[low]) {
            swap(arr, low, mid);
        }
        int temp = arr[low];


        while (low < high) {
            while (low < high && arr[high] >= temp)
                high--;
            swap(arr, low, high);
            while (low < high && arr[low] <= temp)
                low++;
            swap(arr, low, high);
        }
        return                            low;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


}
