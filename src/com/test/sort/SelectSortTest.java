package com.test.sort;

import java.util.Arrays;

public class SelectSortTest {

	public static Integer[] sort(Integer[] arr) {
		int length = arr.length;
		int minIndex, temp = 0;
		for (int i = 0; i < length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}
		return arr;

	}

	public static void main(String[] args) {
/*		int N = 100000;
		Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
		SortTestHelper.testSort("com.test.sort.BubbleSortTest", arr);*/
		 Integer arr[] = {6,5,3,2,1,1,10};
		 arr = sort(arr);
		 System.out.println(Arrays.toString(arr));
		return;
	}
}
