package com.mkj.tddbasic.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathAppTest {
	MathApp app = new MathApp();
	
	@Test
	void test() {
		
		int output = app.doAdd(10, 20);
		
		assertEquals(30,output);
	}
	
	@Test
	void test2()
	{
		assertThrows(ArithmeticException.class,()-> app.doDevide(10,0));
	}

}
