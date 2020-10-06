package com.luo.algorithm.sort;

import sun.security.util.Length;

public class MySort {

    /**
     * 冒泡排序
     * 在每轮里用个循环控制每轮比较的次数，第一轮比较的次数为array.length-1，往后
     * 都是array.length-1-i(即轮数)因为每比较一轮后都有一个数字
     * 到其应该的位置，往后就不需要再比
     * @param array
     * @return
     */
    public static int[] BubbleSort(int array[]){
        //首先用个循环控制总共比较轮次
        for (int i = 0; i < array.length - 1; i++) {
            //控制比较次数
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j+1]){
                    int num= array[j+1];
                    array[j+1] = array[j];
                    array[j]=num;
                }
            }
        }
        return array;
    }

    /**
     * 快速排序
     1.选择第一个数为基准，从数组末尾和头开始循环往前
     2.左序列循环时遇见比基准数大的替换到右序列处，右序列循环时遇见比基准数小的替换到左序列处
     3.对左右区间各自循环直到开始位置和结束位置不相等
     * @param array  排序数组
     * @param start 区间开始位置
     * @param end  区间结束位置
     */
    public static void quickSort(int array[], int start, int end){
        //递归的出口，当开始位置不小于结束位置
        if (start<end){
            //定义标准数为分区开始的数
            int num = array[start];
            //定义左序列
            int low = start;
            int high = end;
            //循环
            while (low < high){
                //右序列循环
                while (low < high && array[high] > num){
                    high--;
                }

                array[low] = array[high];

                //左序列循环
                while (low < high && array[low] < num){
                    low++;
                }

                array[high] = array[low];

            }
            //左右序列相等时，将标准数赋给左右序列相等下标处
            array[low] = num;
            //继续递归循环左右区间
            quickSort(array,start,low);
            quickSort(array,low+1,end);
        }
    }


    /**
     * 1.从第二个数往后循环往前插入，前方序列都为有序序列
     * 2.把要插入的数存到一个变量中，依次与前面所有的数比较
     * 3.插入到其应该在的位置，后面的数字依次后移
     * @param array
     */
    public static int[] straightInsertSort(int array[]){
        //循环插入的数
        for (int i = 1; i < array.length; i++) {
            //循环前面所有的数并插入
            if (array[i-1] > array[i]){
                int tem = array[i];
                int j;
                for (j = i-1; j>=0 && tem < array[j]; j--){
                    //停止循环处的后边数全部后移
                    array[j+1] = array[j];
                }
                //停止循环时j处的数小于tem，所以j+1处的坑给tem
                array[j+1] = tem;
            }
        }
        return array;
    }


    public static void shellSort(int array[]){
        // 遍历所有的步长
        for (int d = array.length / 2; d > 0; d /= 2) {
            // 遍历所有有元素
            for (int i = d; i < array.length; i++) {
                // 遍历本组中所有的元素
                for (int j = i - d; j >= 0; j -= d) {
                    // 如果当前元素大于加上步长后的那个元素
                    if (array[j] > array[j + d]) {
                        int temp = array[j];
                        array[j] = array[j + d];
                        array[j + d] = temp;
                    }
                }
            }
        }
    }


}
