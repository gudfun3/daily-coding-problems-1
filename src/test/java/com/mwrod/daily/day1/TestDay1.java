package com.mwrod.daily.day1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mwrod.daily.day1.Day1;

public class TestDay1 {

	public final List<Integer> listTrue = Arrays.asList(10, 15, 3, 7);
	public final Integer kTrue1 = 17;
	public final Integer kTrue2 = 25;
	public final Integer kTrue3 = 22;
	
	public final List<Integer> listFalse =  Arrays.asList(10, 15, 3, 6);
	public final Integer kFalse1 = 11;
	public final Integer kFalse2 = 24;
	public final Integer kFalse3 = 19;
	
	@Test
	public void testV1TrueCase() {
		Day1 app = new Day1();
				
		assertTrue(app.existsSumV1(listTrue, kTrue1));
		assertTrue(app.existsSumV1(listTrue, kTrue2));
		assertTrue(app.existsSumV1(listTrue, kTrue3));
	}
	
	@Test
	public void testV2TrueCase() {
		Day1 app = new Day1();
				
		assertTrue(app.existsSumV2(listTrue, kTrue1));
		assertTrue(app.existsSumV2(listTrue, kTrue2));
		assertTrue(app.existsSumV2(listTrue, kTrue3));
	}
	
	@Test
	public void testV1FalseCase() {
		Day1 app = new Day1();
				
		assertFalse(app.existsSumV1(listFalse, kFalse1));
		assertFalse(app.existsSumV1(listFalse, kFalse2));
		assertFalse(app.existsSumV1(listFalse, kFalse3));
	}
	
	@Test
	public void testV2FalseCase() {
		Day1 app = new Day1();
				
		assertFalse(app.existsSumV2(listFalse, kFalse1));
		assertFalse(app.existsSumV2(listFalse, kFalse2));
		assertFalse(app.existsSumV2(listFalse, kFalse3));
	}
}
