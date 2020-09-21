package com.luo.algorithm.node;

public class Node {
    private int data;
    private Node next;


    public Node(int data){
        this.data = data;
    }

    //追加节点
    public Node append(Node node){
        //取得当前节点
        Node currentNode = this;
        //循环向后找
        while (true){
            //当前节点的下一个节点的指针
            Node nextNode = currentNode.next();
            if (nextNode==null){
                break;
            }
            //让当前节点更新
            currentNode = nextNode;
        }
        //把追加的节点赋给最后一个节点
        currentNode.next = node;
        return this;
    }


    //删除该节点的下一个节点
    public void removeNext(){
        Node newNode = this.next.next();
        this.next = newNode;
    }

    //取出下一个节点的指针
    public Node next(){
        return this.next;
    }

    //取得当前数据
    public int getData(){
        return this.data;
    }

    //是否是最后一个
    public boolean isLast(){
        return this.next==null;
    }

    //打印当前节点后面所有节点的值
    public String show(){
        Node currentNode = this;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (true){
            builder.append(currentNode.data);
            builder.append(",");
            currentNode = currentNode.next();
            if (currentNode==null){
                break;
            }
        }
        builder.append("]");
        return builder.deleteCharAt(builder.length()-2).toString();

    }

    //插入一个节点
    public void insert(Node node){
        Node nextNext = this.next;
        this.next = node;
        node.next = nextNext;
    }
}
