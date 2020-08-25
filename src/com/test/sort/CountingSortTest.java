package com.test.sort;

import java.util.Arrays;

public class CountingSortTest {
	
    public static Integer[] sort(Integer[] array) {

    	 //得到数组的最大值和最小值，并推算出差值d
        int max=array[0];
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        int d=max-min;
        //创建统计数组并统计对应的元素个数
        int[] countArray=new int[d+1];
        for(int i=0;i<array.length;i++){
            countArray[array[i]-min]++;
        }
        Integer[] sortedArray=new Integer[array.length];
        for(int i = 0, index = 0; i < countArray.length; i++) {
        	int item = countArray[i];
			while(item-- != 0) {
				sortedArray[index++] = i + min;
			}
        }
        
        return sortedArray;
      
    }

    public static void main(String[] args) {
        /*int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("com.test.sort.CountingSortTest", arr);*/
        Integer arr[] = {6,5,3,2,1,1,10,8,7,7,6,5,1,2,3,6,5,4,8};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
        return;
    }
}
