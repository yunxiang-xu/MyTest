package com.test.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSortTest {
	
	public static Integer[] sort(Integer[] arr){
		
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    for(int i = 0; i < arr.length; i++){
	        max = Math.max(max, arr[i]);
	        min = Math.min(min, arr[i]);
	    }
		
	    //桶数
	    int bucketNum = (max - min) / arr.length + 1;
	    ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
	    for(int i = 0; i < bucketNum; i++){
	        bucketArr.add(new ArrayList<Integer>());
	    }
		
	    //将每个元素放入桶
	    for(int i = 0; i < arr.length; i++){
	        int num = (arr[i] - min) / (arr.length);
	        bucketArr.get(num).add(arr[i]);
	    }
		
	    //对每个桶进行排序
	    for(int i = 0; i < bucketArr.size(); i++){
	        Collections.sort(bucketArr.get(i));
	    }
	    int i = 0;
	    Integer[] resultArr = new Integer[arr.length];
 	    for(ArrayList<Integer> lists: bucketArr) {
	    	for(Integer num : lists) {
	    		resultArr[i] = num;
	    		i++;
	    	}
	    }
	    return resultArr;
		
	}

    public static void main(String[] args) {
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("com.test.sort.BucketSortTest", arr);
        /*Integer arr[] = {888,566,788,321,999,581,756,123,448,654,267};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));*/
        return;
    }
}
