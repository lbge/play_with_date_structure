package com.example.straightinsertsort;

import java.util.Arrays;

/**
 * @author Linbo Ge
 * @date 2020/6/20 10:11
 * 直接 插入排序
 * https://zhuanlan.zhihu.com/p/120693682
 */
public class InsertionSort {
    public static void main(String[] args) {

        insertionSort(new int[] {3, 4, 2, 6, 3, 2, 34, 23, 5, 4});

    }


   static void insertionSort(int[] a) {

        int temp;//待插入元素
        int index;//初始值为待插入元素前一个元素的索引

        for (int i = 1; i < a.length; i++) {
            //i从第二个元素开始，默认第一个元素是有序的
            //循环条件是小于数组长度，因为也要将最后一个元素插入到前面的序列
            temp = a[i];
            index = i - 1;
            while (index >=0 && temp < a[index]) {
                //需要保证index合法
                //每当前面的元素比待插入元素大，就向后移动
                a[index + 1] = a[index];
                //不用怕覆盖，因为value保存着待插入的值
                index--;
            }
            //当退出循环，表明已经找到了待插入位置，即index + 1
            a[index + 1] = temp;
        }
       System.out.println(Arrays.toString(a));
    }
}
