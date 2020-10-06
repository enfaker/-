package com.luo.algorithm;

import com.luo.algorithm.sort.MySort;
import org.junit.Test;

import java.util.Arrays;

public class TestSort {


    @Test
    public void testSort(){
        int[] array = {4, 51, 43, 5, 19, 45, 2, 12};

        //冒泡排序
       /* int[] sortArray = MySort.BubbleSort(array);
        System.out.println(Arrays.toString(sortArray));*/

       //快速排序
        /*MySort.quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));*/

        //直接插入排序
        /*int[] sortArray = MySort.straightInsertSort(array);
        System.out.println(Arrays.toString(sortArray));*/

        //希尔排序
        MySort.shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
