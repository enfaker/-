package com.luo.algorithm;

import com.luo.algorithm.queue.MyQueue;
import org.junit.Test;

public class TestQueue {
    @Test
    public void test01(){
        MyQueue queue = new MyQueue();
        System.out.println(queue.display());
        queue.add(11);
        queue.add(123);
        System.out.println(queue.display());
        System.out.println(queue.pull());
        queue.add(12);
        queue.add(13);
        System.out.println(queue.display());
        System.out.println(queue.pull());
        System.out.println(queue.display());
        System.out.println(queue.isEmpty());
    }
}
