package chapter_2.practice_1;


import java.util.Arrays;

import static chapter_2.Insertion_sort.insertSort;


/**
 * @Description: 练习1
 * @Date: 2022/1/10
 * @Author: Everglow
 */
public class Practice_1_1 {
    /**
     * 排序A=[31,41,59,26,41,58]
     */
    public static void main(String[] args) throws Exception {
        int[] a={31,41,59,26,41,58};
        System.out.println(Arrays.toString(insertSort(a,0)));
    }
}
