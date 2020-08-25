package com.test.Pattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler<T> implements InvocationHandler{
	
	private T person;

    public PersonInvocationHandler(T person) {
        this.person = person;
     }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("买之前先讲价");
		Object result = method.invoke(person, args);
		return result;
	}
	
	

}
