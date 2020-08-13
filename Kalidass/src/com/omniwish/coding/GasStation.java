package com.omniwish.coding;

public class GasStation {

	static class GasClass {
		int gas;
		int distance;

		public GasClass(int gas, int distance) {
			this.gas = gas;
			this.distance = distance;
		}
	}

	static int printTour(GasClass arr[], int n) {
		int start = 0;
		int end = 1;
		int curr_gas = arr[start].gas - arr[start].distance;

		while (end != start || curr_gas < 0) {
			while (curr_gas < 0 && start != end) {
				curr_gas -= arr[start].gas - arr[start].distance;
				start = (start + 1) % n;
				if (start == 0)
					return -1;
			}
			curr_gas += arr[end].gas - arr[end].distance;

			end = (end + 1) % n;
		}
		return start;
	}

	public static void main(String[] args) {

		GasClass[] arr = { new GasClass(1, 2), new GasClass(2, 1) };

		int start = printTour(arr, arr.length);

		System.out.println(start);

	}
}