package com.luo.algorithm;

import com.luo.algorithm.loopnode.LoopDoubleNode;
import com.luo.algorithm.loopnode.LoopNode;
import com.luo.algorithm.recursion.MyRecursion;
import org.junit.Test;

public class TestLoopNode {
    @Test
    public void test01(){
        LoopNode node1 = new LoopNode(1);
        LoopNode node2 = new LoopNode(2);
        LoopNode node3 = new LoopNode(3);
        LoopNode node4 = new LoopNode(4);

        node1.insert(node2);
        System.out.println(node1.next().getData());
        System.out.println(node2.next().getData());
        node2.insert(node3);
        node3.insert(node4);
        System.out.println(node2.next().getData());
        System.out.println(node3.next().getData());
        System.out.println(node4.next().getData());
    }


    @Test
    public void testLoopDoubleNode(){
        LoopDoubleNode loopDoubleNode1 = new LoopDoubleNode(1);
        LoopDoubleNode loopDoubleNode2 = new LoopDoubleNode(2);
        LoopDoubleNode loopDoubleNode3 = new LoopDoubleNode(3);
        LoopDoubleNode loopDoubleNode4 = new LoopDoubleNode(4);

        //测试插入
       /* loopDoubleNode1.insert(loopDoubleNode2);
        loopDoubleNode2.insert(loopDoubleNode3);
        loopDoubleNode3.insert(loopDoubleNode4);
        System.out.println(loopDoubleNode1.getRear().getData());
        System.out.println(loopDoubleNode1.getNext().getData());
        System.out.println(loopDoubleNode2.getRear().getData());
        System.out.println(loopDoubleNode3.getNext().getData());
        System.out.println(loopDoubleNode4.getNext().getData());
        System.out.println(loopDoubleNode4.getRear().getData());*/

       //测试删除
        loopDoubleNode1.insert(loopDoubleNode2);
        loopDoubleNode2.insert(loopDoubleNode3);
        loopDoubleNode3.insert(loopDoubleNode4);
        loopDoubleNode1.removeNext();
        System.out.println(loopDoubleNode1.getNext().getData());
        System.out.println(loopDoubleNode3.getRear().getData());
    }
}
