package com.luo.algorithm;

import com.luo.algorithm.loopnode.LoopDoubleNode;
import com.luo.algorithm.loopnode.LoopNode;
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
    }
}
