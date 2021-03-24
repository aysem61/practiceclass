package week05;

import java.util.ArrayList;
import java.util.List;

public class Q04_MultiDimArray {

	public static void main(String[] args) {

		/*
		 * Type a program that can add the even numbers in the array INPUT :
		 * {{1,3,6},{2,8},{5,7,9,14}} OUTPUT : The sum of even numbers is : 26
		 */

		int arr[][] = { { 1, 3, 6 }, { 2, 8 }, { 5, 7, 9, 14 } };
		
		int brr[][]= {{2,34,4,1,5},{1,23,3,5,6},{2,45,5,0,6,8}};

		add(arr);
		add(brr);
	}

	public static void add(int[][] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] % 2 == 0) {

					sum += arr[i][j];
				}

			}

		}

		System.out.println(sum + "cift sayilarin toplami ");

	}

}
