package com.test.basic;

import java.math.BigDecimal;

import com.test.thread.NotifyAndWaitThread;

public class FinalTest {
	final A a = new A();
	class A {
		final int i = 1;
	}
	
	  public static void main(String[] args) throws InterruptedException {
		  FinalTest test = new FinalTest();
		  System.out.println(test.a.i);
		  
		  
		  BigDecimal a  = new BigDecimal(75);
		  System.out.println(a.divide(new BigDecimal(100)).toString());
	     }
}
