package com.test.Pattern.Template;

public class ConcreteTemplate extends AbstractTemplate{

	@Override
	public void abstractMethod() {
		System.out.println("子类实现的抽象方法");
		
	}
	
	public void hookMethod(){
		
		System.out.println("子类实现的钩子方法");
	}

}
