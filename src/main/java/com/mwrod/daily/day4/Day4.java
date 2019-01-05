package com.mwrod.daily.day4;

/**
 * Problem: Given an array of integers, find the first missing positive 
 * 	integer in linear time and constant space. In other words, find the 
 * 	lowest positive integer that does not exist in the array. The array 
 * 	can contain duplicates and negative numbers as well.
 * 
 * Example: The input [3, 4, -1, 1] should give 2. The input [1, 2, 0] 
 * 	should give 3.
 * 
 * You can modify the input array in-place.
 */
public class Day4 {

	/**
	 * Time complexity: O(n)
	 * Space complexity: O(1) (in-place)
	 * 
	 * @param a Array of integers
	 * @return lowest positive integer that does not exist in {@code a}.
	 */
	public int findLowestMissingPositive(int[] a) {
		// move all negatives and 0's to the end
		int endPositive = moveNonPositiveToEnd(a);
		
		for(int i = 0; i < endPositive; i++) {
			// get absolute value and use it as an index
			int val = Math.abs(a[i]);
			
			// mark the index with their negative value if it is in range
			// of possible candidates -> index with negative value representing
			// occurrence of the number of index
			if(val <= endPositive && val > 0) {
				a[val - 1] = -a[val - 1];
			}
		}
		
		// find the first index which value is positive (not marked)
		// this index is the first missing positive number in the array
		for(int i = 0; i < endPositive; i++) {
			if(a[i] > 0) return i + 1;
		}
		
		return endPositive + 1;
	}
	
	/**
	 * @return index at which non-positive numbers are starting
	 */
	private int moveNonPositiveToEnd(int[] a) {
		int j = a.length - 1;
		for(int i = j; i >= 0; i--) {
			if(a[i] <= 0) {
				swap(a, i, j);
				j--;
			}
		}
		return j + 1;
	}
	
	private void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
