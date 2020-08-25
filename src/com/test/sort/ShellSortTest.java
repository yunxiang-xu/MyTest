package com.test.sort;

import java.util.Arrays;

public class ShellSortTest {

	public static Integer[] sort(Integer[] arr) {
		int len = arr.length;
		//gap增量，每次比较数组增加的间隔
		for (int gap = len / 2; gap > 0; gap = gap / 2) {
			//从arr[i]开始比较，因为arr[i] = arr[gap]从这开始比不会数组越界
			for (int i = gap; i < len; i++) {
				int j = i;
				int current = arr[i];
				int k = j-gap;
				int compare = arr[j - gap];
				
				while (j - gap >= 0 && current < arr[j - gap]) {
					arr[j] = arr[j - gap];
					j = j - gap;
				}
				arr[j] = current;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Integer[] arr = {6,1,2,5,4,3,9,7,10,8};
		arr = sort(arr);
		System.out.println(Arrays.toString(arr));
		
		 /*int N = 1000000;
	     Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
	     SortTestHelper.testSort("com.test.sort.ShellSortTest", arr);*/
	}
}
