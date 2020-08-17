package com.test.kmp;

/**
 * @author Linbo Ge
 * @date 2020/6/28 11:21
 */
public class kmp {
    public static void main(String[] args) {
        String s = "hello";
        String t = "ll";
        System.out.println(KMP(s, t));
    }


    private static int KMP(String s, String t) {
        if(t == null || t.length() == 0){
            return 0;
        }
        int[] next = new int[t.length()];
        int i = 0, j = 0;
        getNext(t, next);
        while (i < s.length() && j < t.length()) {
            if (j == -1 || s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else
                j = next[j];
        }
        if (j >= t.length()) {
            return (i - t.length());
        } else
            return -1;
    }

    public static void getNext(String t, int[] next) {

        int j = 0;
        int k = -1;
        next[0] = -1;
        while (j < t.length() - 1) {
            if (k == -1 || t.charAt(j) == t.charAt(k)) {
                j++;
                k++;
                if (t.charAt(j) == t.charAt(k))//当两个字符相同时，就跳过
                    next[j] = next[k];
                else
                    next[j] = k;
            } else k = next[k];
        }
    }
}
