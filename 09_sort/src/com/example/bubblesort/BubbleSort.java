package com.example.bubblesort;

/**
 * @author Linbo Ge
 * @date 2020/6/20 8:56
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 3, 6, 7, 7, 4, 6};
        BubbleSort demo = new BubbleSort();
//        demo.bubbleSort(a);
        demo.bubbleSort2(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    /**
     * 从下往上
     *
     * @param a
     */
    void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int n = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = n;
                }
            }
        }
    }

    /**
     * 加入标签，若无数字交换，说明序已排好
     * @param a
     */
    void bubbleSort2(int[] a) {
        boolean flag = true;
        for (int i = 0; i < a.length && flag; i++) {
            flag = false;
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int n = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = n;
                    flag = true;
                }

            }
        }
    }
}
