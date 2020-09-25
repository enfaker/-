package com.luo.algorithm.sort;

import sun.security.util.Length;

public class MySort {

    /**
     * 冒泡排序
     * 在每轮里用个循环控制每轮比较的次数，第一轮比较的次数为array.length-1，往后
     * 都是array.length-1-i(即轮数)因为每比较一轮后都有一个数字
     * 到其应该的位置，往后就不需要再比
     * @param array
     * @return
     */
    public static int[] BubbleSort(int array[]){
        //首先用个循环控制总共比较轮次
        for (int i = 0; i < array.length - 1; i++) {
            //控制比较次数
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j+1]){
                    int num= array[j+1];
                    array[j+1] = array[j];
                    array[j]=num;
                }
            }
        }
        return array;
    }
}
