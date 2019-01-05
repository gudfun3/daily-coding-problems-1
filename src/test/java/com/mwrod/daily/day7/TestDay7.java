package com.mwrod.daily.day7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDay7 {

	@Test
	public void testCountPossibilitiesDP() {
		Day7 app = new Day7();
		String msg1 = "111";
		String msg2 = "127";
		String msg3 = "2727";
		
		assertEquals(3, app.countDecodePossibilitesDP(msg1));
		assertEquals(2, app.countDecodePossibilitesDP(msg2));
		assertEquals(1, app.countDecodePossibilitesDP(msg3));
	}
	
	@Test
	public void testCountPossibilitiesRecursive() {
		Day7 app = new Day7();
		String msg1 = "111";
		String msg2 = "127";
		String msg3 = "2727";
		
		assertEquals(3, app.countDecodePossibilitesRecursive(msg1));
		assertEquals(2, app.countDecodePossibilitesRecursive(msg2));
		assertEquals(1, app.countDecodePossibilitesRecursive(msg3));
	}
}
