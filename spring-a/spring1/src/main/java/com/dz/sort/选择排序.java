package com.dz.sort;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/12 10:02
 */
public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7, 3, 6, 8};
        int[] sort = sort(arr);
        for (int i : sort) {
            System.out.print(i);
        }
    }

    public static int[] sort(int[] arr) {
        int size = arr.length;
        int temp = arr[0];
        int index = 0;
        for (int i = 0; i < size-1; i++) {
            for (int j = i + 1; j < size;j++) {
                if (temp > arr[j]) {
                    temp = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
