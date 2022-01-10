package chapter_2;

import java.util.Arrays;

/**
 * @Description: 插入算法Java实现
 * @Date: 2022/1/10
 * @Author: Everglow
 */

/**
 * 伪代码
 * for j=2 to A.length
 * key=A[j]
 * // insert A[j] into the sorted sequence A[1...j-1]
 * int i=j-1
 * while i>0 and A[i]>key
 * A[i+1]=key
 * i=i-1
 * A[i+1]=key
 */
public class Insertion_sort {
    /**
     * 排序
     *
     * @param ints
     * @param sign
     * @return
     * @throws Exception
     */
    public static int[] insertSort(int[] ints,int sign) throws Exception {
        if (ints.length == 0) {
            throw new Exception("insertSortAsc ints is null!");
        }
        for (int j = 1; j < ints.length; j++) {
            int key = ints[j];
            int i = j - 1;
            if (sign==0) {
                while (i >= 0 && ints[i] > key) {
                    ints[i + 1] = ints[i];
                    i = i - 1;
                }
            }else if (sign==1){
                while (i >= 0 && ints[i] < key) {
                    ints[i + 1] = ints[i];
                    i = i - 1;
                }
            }
            ints[i + 1] = key;
        }
        return ints;
    }


    public static void main(String[] args) throws Exception {
        int[] ints = {5, 2, 4, 6, 1, 3};
        int[] insertInts = insertSort(ints,0);
        System.out.println(Arrays.toString(Arrays.stream(insertInts).toArray()));
        System.out.println(Arrays.toString(insertSort(ints,1)));

    }
}
