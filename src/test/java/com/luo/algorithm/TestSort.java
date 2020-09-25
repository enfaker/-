package com.luo.algorithm;

import com.luo.algorithm.sort.MySort;
import org.junit.Test;

import java.util.Arrays;

public class TestSort {


    @Test
    public void testBubbleSort(){
        int[] array = {4, 511, 443, 5, 19, 45, 2};
        int[] sortArray = MySort.BubbleSort(array);
        System.out.println(Arrays.toString(sortArray));
    }
}
