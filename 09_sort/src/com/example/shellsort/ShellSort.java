package com.example.shellsort;

import java.util.Arrays;

/**
 * @author Linbo Ge
 * @date 2020/6/20 14:52
 * 希尔排序
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 6, 3, 2, 34, 23, 5, 4};
        shellSort(array);
        String s = Arrays.toString(array);
        System.out.println(s);
    }

    private static void shellSort(int[] a) {
        int temp;//待插元素
        int index;//插入排序时用的索引
        int gap = a.length;//步长

        while (gap > 1) {
            gap = gap / 3 + 1;

            for (int i = 0; i < gap; i++) {
                //按照步长分组进行
                for (int j = i + gap; j < a.length; j =j+ gap) {
                    temp = a[j];
                    index = j - gap;
                    while (index >= 0 && temp < a[index]) {
                        a[index+gap] = a[index];
                        index =index- gap;
                    }
                    a[index + gap] = temp;
                }
            }
        }

    }
}
