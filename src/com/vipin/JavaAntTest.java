package com.vipin;

import org.apache.log4j.Logger;

//@Component
public class JavaAntTest {

	public final static Logger logger = Logger.getLogger(JavaAntTest.class);
	public static void main(String[] args) {
		org.apache.log4j.BasicConfigurator.configure();
		logger.debug("This is the first logger");
		TestClass.simpleTest();
		System.out.println("First Ant Test !!! Hello Ant");
		//System.out.println("Sum of two numbers are : "+ addTwoNum(10, 20));
		//KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		//KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
	}
	
	
	public static int addTwoNum(int a, int b){
		return a+b;
	}

}
