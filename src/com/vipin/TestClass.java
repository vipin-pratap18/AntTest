package com.vipin;

import org.apache.log4j.Logger;

public class TestClass {
	public final static Logger logger = Logger.getLogger(TestClass.class);
	
	public static void simpleTest(){
		
		logger.debug("Logger inside the test class");
		
	}

}
