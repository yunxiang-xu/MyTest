package com.test.Pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
	
	public List<Observer> list = new ArrayList<Observer>();
	

	@Override
	public void addObServer(Observer observer) {
		list.add(observer);

	}

	@Override
	public void deleteObServer(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notify(String message) {
		for(Observer ob : list) {
			ob.update("咳咳，test，test。发布消息："+message);
		}

	}
	
	public static void main(String[] args) {
		SubjectImpl s = new SubjectImpl();
		
		ObserverImpl o1 = new ObserverImpl();
		ObserverImpl2 o2 = new ObserverImpl2();
		
		s.addObServer(o1);
		s.addObServer(o2);
		
		s.notify("111");
		
	}

}
