package com.luo.algorithm.search;

public class Search {

    //线性查找
    public static int linearSearch(int element , int[] array){
        //定义查找下标为-1
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (element==array[i]){
                index = i;
                break;
            }
        }
        return index;
    }

    //二分查找,前提为有序表
    public static int BinarySearch(int element , int[] array){
        //搜寻下标
        int index = -1;
        int start = 0;
        int end = array[array.length-1];
        while (start<=end){
            int middle = (start+end)/2;
            if (array[middle]==element){
                index = middle;
                break;
            } else if (element<array[middle]){
                end = middle-1;
            } else {
                start = middle+1;
            }
        }
        return index;
    }
}
