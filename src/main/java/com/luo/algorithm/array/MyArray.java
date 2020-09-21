package com.luo.algorithm.array;

import java.util.Arrays;

public class MyArray {
    private int[] elements;
    public MyArray(){
        elements = new int[0];
    }

    //查看数组长度
    public int length(){
        return elements.length;
    }

    //数组末尾增加一位数
    public void add(int number){
        int[] newArray = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[elements.length] = number;
        elements = newArray;
    }

    //打印数组内容
    public String printAll(){
        //如果指针为空返回null
        if (elements==null)
            return "null";
        //如果数组长度为-1返回[],并用max结束循环
        int max = elements.length-1;
        if (max==-1)
            return "[]";
        //字符串拼接
        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i=0; ;i++){
            b.append(elements[i]);
            if (i==max)
                return b.append("]").toString();
            b.append(",");
        }
    }

    //删除数组内容
    public void delete(int index){
        if (index< 0 || index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length-1];
        //循环赋值，小于index直接赋，大于小标加一赋值
        for (int i = 0; i < newArr.length; i++) {
            if (i<index){
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i+1];
            }
        }
        elements = newArr;
    }

    //取下标数组
    public int get(int index){
        if (index< 0 || index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    //插入元素到指定数组
    public void insert(int element,int index){
        if (index< 0 || index>elements.length){
            throw new RuntimeException("下标越界");
        }
        int[] newArray = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            //小于index正常赋值，大于index旧数组值赋给新数组下标加一
            if (i<index) {
                newArray[i] = elements[i];
            } else {
                newArray[i+1] = elements[i];
            }
        }
        newArray[index] = element;
        elements = newArray;
    }

    //替换指定下标的值
    public void set(int index , int element){
        if (index< 0 || index>elements.length-1){
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }

}
