package com.luo.algorithm;

import com.luo.algorithm.recursion.MyRecursion;
import org.junit.Test;

public class TestRecursion {

    @Test
    public void fibonacci(){
        int i = MyRecursion.fibonacci2(7);
        System.out.println(i);
    }

    @Test
    public void testHanoi(){
        MyRecursion.hanoi(3,'a','b','c');
    }
}
