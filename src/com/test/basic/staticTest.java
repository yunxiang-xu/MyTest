package com.test.basic;

import com.test.Pattern.Decorator.Circle;

public class staticTest {

	public int i = 0;
	
	public static staticTest aaa() {
		staticTest test = new staticTest();
		return test;
	}
	
	public void  bbb(Circle circle) {
		circle.draw();
	}
	
	
	public static void main(String[] args) {
		staticTest a = staticTest.aaa();
		System.out.println(a.i);
		staticTest b = a.aaa();
		System.out.println(b.i);
		
		b.bbb(new Circle() {
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("Shape: 12313231");
			}
		});
		new staticTest() {
			
		};
		
	}
}
