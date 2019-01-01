package com.mwrod.daily.day4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay4 {

	@Test
	public void testFirstMissing() {
		Day4 app = new Day4();
		
		int[] input1 = new int[] {3, 4, -1, 1};
		assertEquals(2, app.findLowestMissingPositive(input1));
		
		int[] input2 = new int[] {1, 2, 0};
		assertEquals(3, app.findLowestMissingPositive(input2));
		
		int[] input3 = new int[] {-1, 16, 3, -1, 9, 5, -1, 2, 1};
		assertEquals(4, app.findLowestMissingPositive(input3));
	}
}
