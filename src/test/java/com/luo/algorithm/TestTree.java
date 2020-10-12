package com.luo.algorithm;

import com.luo.algorithm.tree.BinaryTree;
import com.luo.algorithm.tree.Node;
import org.junit.Test;

public class TestTree {


    @Test
    public void testBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        Node rootNode = new Node(1);
        Node secondLeftNode = new Node(2);
        Node secondRightNode = new Node(3);

        //遍历二叉树
        binaryTree.setRoot(rootNode);
        rootNode.setLeftNode(secondLeftNode);
        rootNode.setRightNode(secondRightNode);
        secondLeftNode.setLeftNode(new Node(4));
        secondLeftNode.setRightNode(new Node(5));
        secondRightNode.setLeftNode(new Node(6));
        secondRightNode.setRightNode(new Node(7));

        //前序遍历
//        binaryTree.preorderTraversal();
        //中序遍历
//        binaryTree.InOrderTraversal();
        //后序遍历
//        binaryTree.postOrderTraversal();

        //前序查找
        /*Node result = binaryTree.preorderSearch(9);
        System.out.println(result);*/

        //删除节点
        binaryTree.deleteNode(3);
        binaryTree.preorderTraversal();
    }
}
