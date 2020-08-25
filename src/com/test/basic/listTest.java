package com.test.basic;

import java.util.ArrayList;
import java.util.List;

public class listTest {
	
	
	
	 public static void main(String[] args) throws InterruptedException {
		//取出的list
		List<String[]> B = new ArrayList<String[]>();
		//测试数据
		String[] iii = {"1","2","3"};
		String[] jjj = {"4","5","6"};
		B.add(iii);
		B.add(jjj);
 		//原本数组a
		String[] a = {"1","4","5","6"};
		
		
		
		//匹配值
		Integer count = 0;
		//存放匹配值list-X
		List<String> x = new ArrayList<String>();
		
		//获取list中的数组
		for(String[] b : B) {
			//循环数组中的String
			for(String c : b) {
				//接着循环原本数组a
				for(String temp : a) {
					if(c.equals(temp)) {
						count++;
					}
				}
			}
			x.add(count.toString());
			count=0;
		}
		
		 System.out.println("每数组中重复值为："+x);
		  
	 }

}
