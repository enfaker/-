package com.luo.algorithm;

import com.luo.algorithm.stack.MyStack;
import org.junit.Test;

public class TestStack {
    @Test
    public void test01(){
        MyStack stack = new MyStack();
        stack.push(11);
        stack.push(124);
        stack.push(23);
        stack.push(23);
        stack.push(24);
        System.out.println(stack.display());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.display());
    }
}
