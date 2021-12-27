package com.core.program;

public class SortArrayWithoutAnyApiMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,6,2,9,8,4,3,7};
		System.out.println("Before Sorting..");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("");
		System.out.println("After Sorting..");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
