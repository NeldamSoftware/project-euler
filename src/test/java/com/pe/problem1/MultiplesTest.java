package com.pe.problem1;

import org.junit.Assert;
import org.junit.Test;

public class MultiplesTest {

	@Test
	public void isMultiplesOf3() {
		// given
		final int multipleOf = 3;

		final int testVal = 0;
		final int testVal1 = 1;
		final int testVal2 = 3;
		final int testVal3 = 5;
		final int testVal4 = 6;

		Multiples multiples = new Multiples();

		// when

		// thne
		Assert.assertFalse(multiples.isOf(testVal, multipleOf));
		Assert.assertFalse(multiples.isOf(testVal1, multipleOf));
		Assert.assertTrue(multiples.isOf(testVal2, multipleOf));
		Assert.assertFalse(multiples.isOf(testVal3, multipleOf));
		Assert.assertTrue(multiples.isOf(testVal4, multipleOf));

	}
	
	@Test
	public void isMultiplesOf5() {
		// given
		final int multipleOf = 5;

		final int testVal = 0;
		final int testVal1 = 1;
		final int testVal2 = 3;
		final int testVal3 = 5;
		final int testVal4 = 6;
		final int testVal5 = 10;

		Multiples multiples = new Multiples();

		// when

		// thne
		Assert.assertFalse(multiples.isOf(testVal, multipleOf));
		Assert.assertFalse(multiples.isOf(testVal1, multipleOf));
		Assert.assertFalse(multiples.isOf(testVal2, multipleOf));
		Assert.assertTrue(multiples.isOf(testVal3, multipleOf));
		Assert.assertFalse(multiples.isOf(testVal4, multipleOf));
		Assert.assertTrue(multiples.isOf(testVal5, multipleOf));


	}
}
