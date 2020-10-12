package com.luo.algorithm.tree;

public class Node {
    private int data;
    private Node leftNode;
    private Node rightNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    /**
     * 前序遍历二叉树
     */
    public void preorderTraversal() {
        System.out.println(data);
        if (leftNode!=null){
            leftNode.preorderTraversal();
        }
        if (rightNode!=null){
            rightNode.preorderTraversal();
        }
    }

    /**
     * 中序遍历二叉树
     */
    public void InOrderTraversal() {
        if (leftNode!=null){
            leftNode.InOrderTraversal();
        }
        System.out.println(data);
        if (rightNode!=null){
            rightNode.InOrderTraversal();
        }
    }

    /**
     * 后续遍历二叉树
     */
    public void postOrderTraversal() {
        if (leftNode!=null){
            leftNode.postOrderTraversal();
        }
        if (rightNode!=null){
            rightNode.postOrderTraversal();
        }
        System.out.println(data);
    }

    /**
     * 前序查找
     * @param i  查找的值
     * @return   返回的节点
     */
    public Node preorderSearch(int i) {
        Node target = null;
        //如果找到则返回
        if (i==this.data){
            return this;
        }else {
            //没找到且左节点不为空则遍历左节点
            if (leftNode!=null){
                target = leftNode.preorderSearch(i);
                //如果不为空，则说明找到了，停止查找
                if (target!=null){
                    return target;
                }
                //说明左节点没找到，继续查找右节点
            }
            //右节点不为空则查找右节点
            if (rightNode!=null){
                target = rightNode.preorderSearch(i);
            }
        }
        return target;
    }

    /**
     * 删除指定值的节点
     * @param i
     */
    public void delete(int i) {
        //定义一个父节点
        Node Parent = this;
        //判断左节点是否是要删除的值
        if (Parent.leftNode!=null && Parent.leftNode.getData()==i){
            Parent.leftNode = null;
            return;
        }
        //判断右节点是否是要删除的值
        if (Parent.rightNode!=null && Parent.rightNode.getData()==i){
            Parent.rightNode = null;
            return;
        }
        //递归检查删除左儿子
        Parent = this.leftNode;
        if (Parent!=null){
        Parent.delete(i);
        }

        //递归检查删除右儿子
        Parent = this.rightNode;
        if (Parent!=null){
        Parent.delete(i);
        }
    }
}
