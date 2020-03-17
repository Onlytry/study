package com.dz.sort;

/**
 * @author DZ
 * @version 1.0
 * @date 2020/3/12 10:41
 */
public class 快速排序 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7, 3, 6, 8};
        sort(arr,0,arr.length-1);
      for (int i : arr) {
            System.out.print(i);
        }
    }
    public static void sort(int[] arr,int l,int r) {
        int left = l;
        int right = r;
            int pivot = arr[(l+r)/2];
            int temp = 0;
            while (left<right){
                while (arr[left]<pivot){
                    left+=1;
                }
                while (arr[right]>pivot){
                    right-=1;
                }

                if (left>=right){
                    break;
                }
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                if (arr[left]==pivot){
                    right-=1;
                }
                if (arr[right]==pivot){
                    left+=1;
                }
                if (left==right){
                    left+=1;
                    right-=1;
                }
                if (l<right){
                    sort(arr,l,right);
                }
                if (r>left){
                    sort(arr,left,r);
                }


            }



    }
}
