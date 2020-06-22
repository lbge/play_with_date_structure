package com.example.mergingsort;

import java.util.Arrays;

/**
 * @author Linbo Ge
 * @date 2020/6/21 14:30
 * 迭代法归并排序
 * https://zhuanlan.zhihu.com/p/124356219
 */
public class MergeSort2 {
    public static void main(String[] args) {
        int[] a = {5, 6, 3, 1, 4, 8, 9, 7};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] array) {
        int length = array.length;
        int block, start;
        int[] result = new int[length];
        for (block = 1; block < length * 2; block *= 2) {
            for (start = 0; start < length; start += 2 * block) {
                int low = start;
                int mid = Math.min((start + block), length);
                int high = Math.min((start + 2 * block), length);

                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;

                while (start1 < end1 && start2 < end2) {
                    result[low++] = array[start1] < array[start2] ? array[start1++] : array[start2++];
                }
                while (start1 < end1) {
                    result[low++] = array[start1++];
                }
                while (start2 < end2) {
                    result[low++] = array[start2++];
                }
            }
            //将每次处理好的结果作为下次的输入
            int[] temp = array;
            array = result;
            result = temp;
        }
    }
}
