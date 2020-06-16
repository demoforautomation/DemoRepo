package com.sks.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorImpl implements Calculator {

	private static final Logger logger = LogManager.getLogger(CalculatorImpl.class);

	public int add(int num1, int num2) {

		logger.info("add method started for execution to add two integer numbers"+num1 + num2);
		return num1 + num2;
	}

}
