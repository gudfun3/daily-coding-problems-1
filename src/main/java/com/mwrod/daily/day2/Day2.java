package com.mwrod.daily.day2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day2 {
	
	/**
	 * Time Complexity: O(n) <br>
	 * Space Complexity: O(n)
	 * 
	 * @param a Array of integers
	 * @return New array such that each element at index i of the new
	 * 	array is the product of all the numbers in <code>a</code>
	 * 	except the one at i.
	 */
	public int[] productArrayV1(int[] a) {
		int product = Arrays.stream(a).reduce(1, (n1, n2) -> n1 * n2);
		
		return IntStream.range(0, a.length)
				.map(i -> product / a[i])
				.toArray();
	}
	
	/**
	 * Solution without using the division operator. <br>
	 *
	 * Time Complexity: O(n) <br>
	 * Space Complexity: O(n)
	 * 
	 * @param a Array of integers
	 * @return New array such that each element at index i of the new
	 * 	array is the product of all the numbers in <code>a</code>
	 * 	except the one at i.
	 */
	public int[] productArrayV2(int[] a) {
		// use two arrays to store product of left side and right side
		// of each element in the given array
		int[] left = new int[a.length];
		int[] right = new int[a.length];
		int[] result = new int[a.length];
		
		left[0] = 1;
		right[right.length -1] = 1;
		
		// iterate a from left to right and calculate product of 
		// all previous elements without including current element
		for(int i = 1; i < a.length; i++) {
			left[i] = a[i - 1] * left[i - 1];
		}
		
		// iterate a from right to left and calculate product of 
		// all previous elements without including current element
		for(int i = a.length - 2; i >= 0; i--) {
			right[i] = a[i + 1] * right[i + 1];
		}
		
		// multiply left and right to get resulting array
		for(int i = 0; i < a.length; i++) {
			result[i] = left[i] * right[i];
		}
		
		return result;
	}
}
