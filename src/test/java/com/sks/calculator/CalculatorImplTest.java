package com.sks.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorImplTest {

	private int num1;
	private int num2;
	private int expectedResult;

	public CalculatorImplTest(int num1, int num2, int result) {

		this.num1 = num1;
		this.num2 = num2;
		this.expectedResult = result;

	}

	@Parameters
	public static Collection<Integer[]> data() {

		return Arrays.asList(new Integer[][] { { 1, 2, 3 }, { 4, 5, 9 } });

	}

	@Test
	public void addShouldReturnaResult() {

		Calculator c = new CalculatorImpl();
		int result = c.add(num1, num2);
		assertEquals(expectedResult, result);

	}

}
