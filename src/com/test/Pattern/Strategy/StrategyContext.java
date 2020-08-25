package com.test.Pattern.Strategy;

public class StrategyContext {

	private Strategy s;
	
	public StrategyContext(Strategy s) {
		this.s = s;
	}
	
	public void doStrategy() {
		s.doSomething();
	}
	
}
