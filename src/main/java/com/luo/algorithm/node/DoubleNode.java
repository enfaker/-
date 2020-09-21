package com.luo.algorithm.node;

public class DoubleNode {
    //存数据
    private int data;
    private DoubleNode rear;
    private DoubleNode next;


    public DoubleNode(int data){
        this.data = data;
    }

    //获取数据
    public int getData(){
        return this.data;
    }

    //获取下一个节点
    public DoubleNode getNext(){
        return this.next;
    }

    //获取前一个结点
    public DoubleNode getRear(){
        return this.rear;
    }


    //加入一个节点
    public DoubleNode append (DoubleNode newNode){
        //取得当前节点
        DoubleNode currentNode = this;
        //循环到最后一个节点
        while (true){
            //取出当前节点的下一个节点
            DoubleNode nextNode = currentNode.next;
            //如果下一个节点为空则退出循环
            if (nextNode==null){
                break;
            }
            //让当前节点往后
            currentNode = nextNode;
        }
        //把新节点加到最后一个节点后面
        currentNode.next = newNode;
        newNode.rear = currentNode;
        return this;
    }

    //插入一个节点
    public void insert(DoubleNode newNode){
        //取出下个节点
        DoubleNode nextNext = this.next;
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
        DoubleNode nextNext = this.next.getNext();
        if (nextNext==null){
            this.next=null;
            return;
        }
        //将下下个节点放到本节点后面
        this.next = nextNext;
        nextNext.rear = this;
    }
}
