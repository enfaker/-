package com.luo.algorithm.recursion;

public class MyRecursion {


    /**
     * 数列第一二位为1，从第三位开始，值为前两项之和。
     * 此递归算法为O(2^n),效率低
     * @param n
     * @return
     */
    public static int fibonacci(int n){
        if (n==1 || n==2){
            return 1;
        }else return fibonacci(n-1)+fibonacci(n-2);
    }


    /**
     * 用遍历的解法
     * 时间复杂度为O（n）
     * @param n
     * @return
     */
    public static int fibonacci2(int n){
        int n1 = 1;
        int n2 = 1;
        if (n==1 || n==2){
            return 1;
        }
        int result = 0;
        for (int i =3;i<=n;i++){
            result = n1+n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }

    /**
     * 简化为3步
     * 1.把最下面的圆环上面的所有圆环移动中间
     * 2.把最下面的圆环移到最终柱子
     * 3.把中间的所有圆环移到最终柱子
     *
     * @param n 圆环数
     * @param from  原始柱子
     * @param middle  中间柱子
     * @param to  最终柱子
     */
    public static void hanoi(int n, char from, char middle ,char to){
        //如果只有一个圆环需要移动，这也为递归的出口
        if (n==1){
            System.out.println("第一个圆环从"+from+"移到"+to);
        }else {
            //把最下面的圆环上面的所有圆环移动中间
            hanoi(n-1,from,to,middle);
            //移动最下面的一个圆环
            System.out.println("第"+n+"个圆环从"+from+"移到"+to);
            //把中间的所有圆环移到最终柱子
            hanoi(n-1,middle,from,to);
        }
    }
}
