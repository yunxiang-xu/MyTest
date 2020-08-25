package com.test.Pattern.Adapter;


public class AdapterDemo {

	public static void main(String[] args) {
		//第一种适配器用法
        System.out.println("-------------第一种适配器------------");
        Phone phone = new ClassAdapter();
        phone.typeC();;//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");
        
        //第二种适配器用法
        System.out.println("-------------第二种适配器------------");
        ObjectAdapter obj = new ObjectAdapter(new Phone());
        obj.HDMIVoice();;//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");
        
        //第三种适配器用法
        System.out.println("-------------第三种适配器------------");
        AbstractAdapter a = new AbstractAdapter(new Phone());
        a.HDMIImg();
        a.HDMIVoice();;//适配器将typec转换成vga
        System.out.println("显示屏对接适配器，手机成功投影到显示屏!");
	   }
}
