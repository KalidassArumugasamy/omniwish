package com.omniwish.coding;

public class MaxContiguousSubArray {

	static void printKMax(int arr[], int n, int k) {
		int j, max;

		for (int i = 0; i <= n - k; i++) {
			max = arr[i];
			for (j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.print(max + " ");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
		int k = 4;
		printKMax(arr, arr.length, k);
	}
}