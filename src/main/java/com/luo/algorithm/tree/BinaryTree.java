package com.luo.algorithm.tree;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 前序遍历二叉树
     */
    public void preorderTraversal() {
        if (root!=null){
        root.preorderTraversal();
        }
    }

    /**
     * 中序遍历二叉树
     */
    public void InOrderTraversal(){
        if (root!=null){
        root.InOrderTraversal();
        }
    }

    /**
     * 后序遍历二叉树
     */
    public void postOrderTraversal() {
        if (root!=null){
        root.postOrderTraversal();
        }
    }

    /**
     * 前序查找二叉树
     * @param i
     * @return
     */
    public Node preorderSearch(int i) {
        return root.preorderSearch(i);
    }

    /**
     * 删除指定节点数的值
     * @param i
     */
    public void deleteNode(int i){
        if (i == root.getData()){
            root=null;
        }else root.delete(i);
    }
}
