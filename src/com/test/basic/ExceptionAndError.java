package com.test.basic;

import java.util.concurrent.atomic.AtomicInteger;

public class ExceptionAndError {
	
	public RuntimeException e;
	
	public NullPointerException e1;
	
	 public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
		 AtomicInteger atomicInteger=new AtomicInteger(0);
		 int i=atomicInteger.get();
		 atomicInteger.compareAndSet(i,i++);
		 
	     }

}
