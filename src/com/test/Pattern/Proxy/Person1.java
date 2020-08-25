package com.test.Pattern.Proxy;

public class Person1 implements Person{
	private String name;
	public Person1(String name) {
		this.name = name;
	}

	@Override
	public void buyFruit() {
		 System.out.println(name+"买了水果");
		
	}

	@Override
	public void buyVegetable() {
		System.out.println(name+"买了蔬菜");
		
	}

}
