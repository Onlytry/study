package com.dz.sort;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/12 9:41
 */
public class 冒泡排序 {

    public static void main(String[] args) {
        int[] arr ={9,4,1,7,3,6,8};
        int[] sort = sort(arr);
        for (int i : sort) {
            System.out.print(i);
        }
    }
    public  static  int[]  sort(int[] arr){
        int temp = 0;
        int size = arr.length;
        for (int i = 0; i < size-1; i++) {
            for (int j=0; j < size-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        return arr;
    }
}
