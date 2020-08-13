package com.omniwish.coding;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class SmallestSubSequence {

	static int lengthOfSmallestSubsequence(int K, int[] v) {
		Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < v.length; i++) {
			pq.add(v[i]);
		}
		int sum = 0, count = 0;
		while (!pq.isEmpty() && sum < K) {
			sum += pq.peek();
			pq.remove();
			count++;
		}

		if (sum < K) {
			return -1;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] v = { 2, 3, 1, 5, 6, 3, 7, 9, 14, 10, 2, 5 };
		int K = 35;
		System.out.print(lengthOfSmallestSubsequence(K, v));
	}
}