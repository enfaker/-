package com.luo.algorithm.stack;

public class MyStack {
    private int[] elements;
    public MyStack(){
        elements = new int[0];
    }

    //栈的push
    public void push(int element){
        int[] newArray = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    //删除栈顶元素，pop
    public int pop(){
        //当栈为空，pop为报异常
        if (elements.length==0){
            throw new RuntimeException("stack is empty");
        }
        int top = elements[elements.length-1];
        //定义一个新数组长度为原数组减一
        int[] newArray = new int[elements.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
        return top;
    }

    //查看栈顶元素
    public int peek(){
        if (elements.length==0){
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length-1];
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }

    //打印栈中元素
    public String display(){
        //判断栈中元素是否为空
        if (elements.length==0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; ; i++) {
            builder.append(elements[i]);
            if (i==elements.length-1){
                return builder.append("]").toString();
            }
            builder.append(", ");
        }
    }
}
