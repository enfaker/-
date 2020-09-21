package com.luo.algorithm.loopnode;

public class LoopNode {
    private int data;
    private LoopNode next = this;


    public LoopNode(int data){
        this.data = data;
    }


    //删除该节点的下一个节点
    public void removeNext(){
        LoopNode newNode = this.next.next();
        this.next = newNode;
    }

    //取出下一个节点的指针
    public LoopNode next(){
        return this.next;
    }

    //取得当前数据
    public int getData(){
        return this.data;
    }



    //插入一个节点
    public void insert(LoopNode node){
        LoopNode nextNext = this.next;
        this.next = node;
        node.next = nextNext;
    }
}
