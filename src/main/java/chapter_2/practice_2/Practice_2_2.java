package chapter_2.practice_2;


import java.util.Arrays;

/**
 * @Description:
 * @Date: 2022/1/12
 * @Author: Everglow
 */

public class Practice_2_2 {

    public static void main(String[] args) {
        /**
         * 伪代码
         *  for i=0 to A.length-1
         *      minIndex=i
         *      for j=i+1 to A.length
         *          if A[j]<A[minIndex]
         *              minIndex=j
         *      swap(A[i],A[minIndex])
         *      i=i+1
         */
        int[] a={1,2,4,5,7,6,3};
        int n=a.length;
        for (int i=0;i<n-1;i++){
            int minIndex=i;
            System.out.println(i);
            for (int j=i+1;j<n;j++){
                if (a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            int b=a[minIndex];
            a[minIndex]=a[i];
            a[i]=b;
        }
        System.out.println(Arrays.toString(a));
    }


}
