package com.luo.algorithm;

import com.luo.algorithm.node.DoubleNode;
import com.luo.algorithm.node.Node;
import org.junit.Test;

public class TestNode {

    @Test
    public void nodeTest(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.append(node2).append(node3).append(node4);

//        System.out.println(node1.next().getData());

//        System.out.println(node1.next().next().next().isLast());

        //删除节点
        /*node1.removeNext();
        System.out.println(node1.next().getData());
        node1.removeNext();
        System.out.println(node1.next().getData());*/

        //插入节点
        /*System.out.println(node1.show());
        node1.removeNext();*/

        Node node = new Node(5);
        node2.insert(node);
        System.out.println(node1.show());
    }



    @Test
    public void testDoubleNode(){
        DoubleNode doubleNode1 = new DoubleNode(1);
        DoubleNode doubleNode2 = new DoubleNode(2);
        DoubleNode doubleNode3 = new DoubleNode(3);
        DoubleNode doubleNode4 = new DoubleNode(4);
        doubleNode1.append(doubleNode2).append(doubleNode3).append(doubleNode4);

        //测试append
       /* System.out.println(doubleNode1.getNext().getData());
        System.out.println(doubleNode2.getRear().getData());
        System.out.println(doubleNode3.getNext().getData());
        System.out.println(doubleNode3.getRear().getData());
        System.out.println(doubleNode4.getRear().getData());*/

       //测试remove
//        doubleNode1.removeNext();
//        System.out.println(doubleNode1.getNext().getData());
//        System.out.println(doubleNode3.getRear().getData());
    }
}
