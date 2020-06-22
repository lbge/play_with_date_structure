package com.example.mergingsort;

import java.util.Arrays;

/**
 * @author Linbo Ge
 * @date 2020/6/21 10:43
 * 递归法归并排序
 * https://zhuanlan.zhihu.com/p/124356219
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {5, 6, 3, 1, 4, 8, 9, 7};
        MergeSort(a);
        System.out.println(Arrays.toString(a));
    }


    static void MergeSort(int[] a) {
        int length = a.length;
        int[] result = new int[length];
        Msort(a, result, 0, length - 1);
    }

    static void Msort(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int length = end - start, mid = (length >> 1) + start;//右移一位除以二，相当于（a-b)/2 +a
        int start1 = start,end1 = mid;
        int start2 = mid + 1,end2 = end;
        Msort(arr, result, start1, end1);
        Msort(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1) {
            result[k++] = arr[start1++];
        }
        while (start2 <= end2) {
            result[k++] = arr[start2++];
        }
        for (k = start; k <= end; k++) {
            arr[k] = result[k];
        }
    }
}
