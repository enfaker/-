package com.luo.algorithm.loopnode;

public class LoopDoubleNode {
    //存数据
    private int data;
    private LoopDoubleNode rear = this;
    private LoopDoubleNode next = this;


    public LoopDoubleNode(int data){
        this.data = data;
    }

    //获取数据
    public int getData(){
        return this.data;
    }

    //获取下一个节点
    public LoopDoubleNode getNext(){
        return this.next;
    }

    //获取前一个结点
    public LoopDoubleNode getRear(){
        return this.rear;
    }

    

    //插入一个节点
    public void insert(LoopDoubleNode newNode){
        //取出下个节点
        LoopDoubleNode nextNext = this.next;
        //在当前节点后插入新节点
        this.next = newNode;
        newNode.rear = this;
        //把nextNext插在新节点后面
        newNode.next = nextNext;
        nextNext.rear = newNode;

    }


    //删除下一个节点
    public void removeNext(){
        //取出下下个节点
        LoopDoubleNode nextNext = this.next.getNext();
        //将下下个节点放到本节点后面
        this.next = nextNext;
        nextNext.rear = this;
    }
}
