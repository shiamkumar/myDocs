package com.java.codings;

public class BinarySearchMain {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6, 7, 8, 9, -70 };
		int low = 0;
		int high = arr.length - 1;
		int key = 5; // searching element and result should return index position
		int result = binarySearch(arr, low, high, key);
		int print = (result == -1) ? -1 : result;
		System.out.println(print);
	}

	public static int binarySearch(int arr[], int low, int high, int key) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}

		if (low > high) {
			return -1;
		}
		return -1;
	}
	
}

