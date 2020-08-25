package com.test.thread;

import java.util.concurrent.locks.LockSupport;
/**
 * 此类在于探索park和unpark函数的使用
 * 
 * park函数，阻塞当前线程，其他某个线程将当前线程作为目标调用 unpark，其他某个线程中断当前线程，该调用不合逻辑地(即毫无理由地)返回前都会被阻塞
 * unpark函数，将传入的线程解除阻塞态
 * 
 * 底层实现都使用的是UNSAFE类的park，unpark方法
 * 
 * */

public class MyThread2 extends Thread{

		 private Object object;

		    public MyThread2(Object object) {
		        this.object = object;
		    }

		    public void run() {
		        System.out.println("before unpark");
		        try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        // 获取blocker
		        System.out.println("Blocker info " + LockSupport.getBlocker((Thread) object));
		        // 释放许可
		        LockSupport.unpark((Thread) object);
		        // 休眠500ms，保证先执行park中的setBlocker(t, null);
		        try {
		            Thread.sleep(500);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        // 再次获取blocker
		        System.out.println("Blocker info " + LockSupport.getBlocker((Thread) object));

		        System.out.println("after unpark");
		    }
		    
		    public static void main(String[] args) {
		        MyThread2 myThread = new MyThread2(Thread.currentThread());
		        myThread.start();
		        System.out.println("before park");
		       
		        // 获取许可
		        LockSupport.park("ParkAndUnparkDemo");
		        System.out.println("after park");
		    }
}


