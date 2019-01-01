package com.mwrod.daily.day2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day2 {
	
	/**
	 * @param a Array of integers
	 * @return New array such that each element at index i of the new
	 * 	array is the product of all the numbers in <code>a</code>
	 * 	except the one at i.
	 */
	public int[] productList(int[] a) {
		int product = Arrays.stream(a).reduce(1, (n1, n2) -> n1 * n2);
		
		return IntStream.range(0, a.length)
				.map(i -> product / a[i])
				.toArray();
	}
}
