package com.james.data.structures.algorithm;

import java.util.Arrays;
/**
 * 冒泡排序
 *
 */
public class BubbleSort {
    public static void BubbleSort(int[] arr) {
        int temp;//定义一个临时变量
        for(int i=0;i<arr.length-1;i++){//冒泡趟数
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j]; //将第一个数组暂存到temp
                    arr[j] = arr[j+1];//因为arr[j+1]比arr[j]值小，所以将arr[j+1]放到arr[j]之前，即交换位置
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,6,2,2,5};
        BubbleSort.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}