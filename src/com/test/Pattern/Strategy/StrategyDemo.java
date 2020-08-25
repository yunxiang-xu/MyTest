package com.test.Pattern.Strategy;

public class StrategyDemo {

	
	public static void main(String[] args) {
		
		
		StrategyContext c = new StrategyContext(new StrategyImpl1());
		c.doStrategy();
		
		c = new StrategyContext(new StrategyImpl2());
		c.doStrategy();
	}
        
       
}
