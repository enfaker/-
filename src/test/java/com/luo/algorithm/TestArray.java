package com.luo.algorithm;

import com.luo.algorithm.array.MyArray;
import org.junit.Test;

import java.util.Arrays;

public class TestArray {
    @Test
    public void test01(){
        MyArray array = new MyArray();
        System.out.println(array.printAll());
        array.add(80);
        array.add(44);
        array.add(52);
        array.add(52);
        array.add(55);
        System.out.println(array.printAll());
        array.delete(2);
        System.out.println(array.printAll());
        array.delete(0);
        System.out.println(array.printAll());
        System.out.println(array.get(0));
        System.out.println(array.length());
        array.set(0,4);
        System.out.println(array.printAll());
        array.insert(100,1);
        System.out.println(array.printAll());
        array.insert(99,0);
        System.out.println(array.printAll());
        array.insert(99,5);
        System.out.println(array.printAll());
    }
}
