package com.example.heapsort;

import java.util.Arrays;

/**
 * @author Linbo Ge
 * @date 2020/6/20 17:01
 * 堆排序
 * https://www.cnblogs.com/chengxiao/p/6129630.html
 */
public class HeapSort {
    public static void main(String[] args) {
        int [] array = {50,10,90,30,70,40,80,60,20};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

   public static void sort(int[] a) {
        //构建最大顶堆
        for (int i = a.length / 2 - 1; i >=0; i--) {
            //从第一个非叶子节点从下到上，从右到左调整结构
            adjustHeap(a, i, a.length);
        }
        //交换堆顶与末尾元素，调整堆结构
        for (int j = a.length - 1; j >0; j--) {
            swap(a, 0, j);
            adjustHeap(a, 0, j);
        }
    }

    /**
     * 交换
     * @param a
     * @param i
     * @param j
     */
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 调整大顶堆
     * @param a
     * @param i
     * @param l
     */
    private static void adjustHeap(int[] a, int i, int l) {
        int temp = a[i];
        for (int j = i * 2 + 1; j < l; j = j * 2 + 1) {
            if (j + 1 < l && a[j] < a[j + 1]) {
                j++;
            }
            if (temp < a[j]) {
                a[i] = a[j];
                i = j;
            } else {
                break;
            }
        }
        a[i] = temp;

    }

}
