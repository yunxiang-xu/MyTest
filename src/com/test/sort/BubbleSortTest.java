package com.test.sort;

import java.util.Arrays;

public class BubbleSortTest {
	
    public static Integer[] sort(Integer[] arr) {

    	for(int i = 0; i<arr.length-1;i++) {
    		for(int j = 0; j<arr.length-i-1; j++) {
    			
    			if(arr[j] > arr[j+1]) {
    				int temp = arr[j+1];
    				arr[j+1] = arr[j];
    				arr[j] = temp;
    			}
    			
    		}
    	}
    	
    	return arr;
    }

    public static void main(String[] args) {
/*        int N = 100000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("com.test.sort.BubbleSortTest", arr);*/
        Integer arr[] = {6,5,3,8,2,1,1,10};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
        return;
    }
}
