package com.test.sort;

import java.util.Arrays;

public class InsertSort {
	
	public static Integer[] sort(Integer[] arr) {
		int length = arr.length;
		int pre,current;
		for(int i=1;i<length;i++) {
			pre = i-1;
			current = arr[i];
			while(pre>=0 && arr[pre] > current ) {
				arr[pre+1] = arr[pre]; 
				pre--;
			}
			arr[pre+1] = current;
		}
		
		return arr;
	}

	
	public static void main(String[] args) {
/*		int N = 100000;
		Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
		SortTestHelper.testSort("com.test.sort.InsertSort", arr);*/
		Integer arr[] = { 6, 5, 3, 2, 1, 1, 10 };
		arr = sort(arr);
		System.out.println(Arrays.toString(arr));
		return;
	}
}
