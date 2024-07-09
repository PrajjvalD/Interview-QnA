package com.java.interview.questions;

import java.util.Scanner;

public class FindMinMaxFromArray {
	
	public static int[] findMaxMin(int[] arr) {
		int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[]{max, min};
    }
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter arry size :");
	int n = sc.nextInt();
	
	int arr[] = new int[n];
	System.out.println("Enter array element.");
	for(int i = 0;i < arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	
	int[] result = findMaxMin(arr);

    System.out.println("Maximum value is: " + result[0]);
    System.out.println("Minimum value is: " + result[1]);
	
}
}
