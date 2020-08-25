package com.test.Pattern.Observer;


/**
 * 
 * 观察者具体实现类
 * */
public class ObserverImpl implements Observer {

	@Override
	public void update(String message) {
		System.out.print("观察者1收到了信息："+message);

	}

}
