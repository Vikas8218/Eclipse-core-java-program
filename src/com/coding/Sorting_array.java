package com.coding;

public class Sorting_array {

	public static void main(String[] args) {
		int[] arr= {12,45,3,4,2,65,43,65};
		int n =arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
				 int temp =arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1] =temp;
				}
			}
		}
		System.out.println("Our sorting array !!");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
