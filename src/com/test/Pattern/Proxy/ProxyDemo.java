package com.test.Pattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Objects;

public class ProxyDemo {
	
	 public static void main(String[] args) {
	        
	        //创建一个实例对象，这个对象是被代理的对象
	        Person p = new Person1("aaa");
	        
	        //创建一个与代理对象相关联的InvocationHandler
	        InvocationHandler stuHandler = new PersonInvocationHandler<Person>(p);
	        
	        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
	        Person perProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

	       //代理执行买水果的方法
	        perProxy.buyFruit();
	        perProxy.buyVegetable();
	        
	    }
	}


