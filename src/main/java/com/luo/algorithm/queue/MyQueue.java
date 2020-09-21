package com.luo.algorithm.queue;

public class MyQueue {
    private int[] elements;
    public MyQueue(){
        elements = new int[0];
    }

    //进队列
    public void add(int element){
        int[] newArray = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    //出队列
    public int pull(){
        if (elements.length==0){
            throw new RuntimeException("queue is empty");
        }
        //取出队首元素
        int front = elements[0];
        //定义一个新数组比旧数组长度小一
        int[] newArray = new int[elements.length-1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i+1];
        }
        elements = newArray;
        return front;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }

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
