package com.neel.algo.sorts;

public class QuickSort {

	static int[] arr = { 12, 5, 9, 3, 6, 2, -2, 10, 7, 4, 8 };

	public static void main(String[] args) {
		int len = arr.length;
		quickSort(0, len - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	static void quickSort(int s, int e) {
		if (s < e) {
			int mid = (s + e) / 2;
			int temp = 0;

			for (int i = s; i < mid; i++) {
				if (arr[i] > arr[mid]) {
					temp = arr[i];
					System.arraycopy(arr, i + 1, arr, i, e- i);
					arr[e] = temp;
					mid--;
					i--;
					
				}
			}

			for (int j = mid + 1; j < e+1; j++) {
				if (arr[j] < arr[mid]) {
					temp = arr[j];
					System.arraycopy(arr, s, arr, s + 1, j-s);
					arr[s] = temp;
					mid++;
					j--;
				}
			}

			quickSort(s, mid - 1);
			quickSort(mid + 1, e);
		}

	}

}
