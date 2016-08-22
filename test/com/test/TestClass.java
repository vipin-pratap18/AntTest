package com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.vipin.JavaAntTest;

public class TestClass {
	
	@Test
	public void testAddTwoNum() {
		assertEquals("10 + 5 must be 15", 15, JavaAntTest.addTwoNum(10, 5));
	}

}
