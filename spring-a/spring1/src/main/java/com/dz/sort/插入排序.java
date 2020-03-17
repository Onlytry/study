package com.dz.sort;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/12 10:22
 */
public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7, 3, 6, 8};
        int[] sort = sort(arr);
        for (int i : sort) {
            System.out.print(i);
        }
    }
 //
    public static int[] sort(int[] arr) {
       int size = arr.length;
       int temp = arr[0];
        for (int i = 1; i < size-1; i++) {
            for (int j = 0; j < i+1; j++) {
                   if (arr[i]>arr[j]){

                   }
            }

        }


        return arr;
    }
}
