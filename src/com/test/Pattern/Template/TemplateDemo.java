package com.test.Pattern.Template;

public class TemplateDemo {
	

	 public static void main(String[] args) {
	        
		 ConcreteTemplate c = new ConcreteTemplate();
		 ConcreteTemplate b = new ConcreteTemplate();
		 c.templateMethod();
	        c.getClass();
	        System.out.println(c.getClass().equals(b.getClass()));
	        System.out.println(null+"1231");
	    }
}

