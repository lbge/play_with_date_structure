package com.example.simpleselectsort;

/**
 * @author Linbo Ge
 * @date 2020/6/20 9:40
 * 简单选择排序
 */
public class SimpleSelectSort {

    public static void main(String[] args) {
        int[] array= {23,455,2,66,34,56,66,1,2};
        SimpleSelectSort sort = new SimpleSelectSort();
        sort.selectSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    void selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j <=a.length - 1; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int n = a[i];
                a[i] = a[min];
                a[min] = n;
            }
        }
    }

}
