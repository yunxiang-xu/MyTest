package com.test.Pattern.Observer;

/**
 * 观察者订阅对象
 * */
public interface Observer {

	/**
	 * 获取通知接口
	 * */
	void update(String message);
	
}
