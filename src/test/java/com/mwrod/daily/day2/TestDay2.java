package com.mwrod.daily.day2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.mwrod.daily.day2.Day2;

public class TestDay2 {

	@Test
	public void testResult() {
		Day2 app = new Day2();
		
		int[] input1 = new int[] {1, 2, 3, 4, 5};
		int[] input2 = new int[] {3, 2, 1};
		
		int[] result1 = new int[] {120, 60, 40, 30, 24};
		int[] result2 = new int[] {2, 3, 6};
		
		assertArrayEquals(result1, app.productList(input1));
		assertArrayEquals(result2, app.productList(input2));
	}
}
