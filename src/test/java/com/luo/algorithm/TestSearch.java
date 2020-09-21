package com.luo.algorithm;

import com.luo.algorithm.search.Search;
import org.junit.Test;

public class TestSearch {
    @Test
    public void tes01(){
        int[] array = new int[]{1,4,5,6,7};
        int index = Search.linearSearch(0, array);
        System.out.println(index);
    }

    @Test
    public void test02(){
        int[] array = new int[]{1,3,4,6,7,9,11,13};
        int i = Search.BinarySearch(0, array);
        System.out.println(i);
    }
}
