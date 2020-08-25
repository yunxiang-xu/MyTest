package com.test.thread;

/**
 * 此类在于探索notify和wait函数的使用
 * 
 * 调用某个作为锁的Object.wait()函数，会将持有锁的线程挂起，在被调用notify函数之前，其状态都会是阻塞
 * 调用某个锁的notify函数，持有锁当前线程还会继续执行，但其余被挂起的线程会被唤醒一个，作为当前线程执行完毕后下一个执行的线程
 *  
 * */
public class NotifyAndWaitThread extends Thread{
	static NotifyAndWaitThread myThread2 = new NotifyAndWaitThread();
		 public void run() {
		        synchronized (myThread2) {
		            System.out.println("before notify");    
		            System.out.println("after notify");  
		            myThread2.notify();
		        }
		    }
		

	
			  public static void main(String[] args) throws InterruptedException {
			         NotifyAndWaitThread myThread = new NotifyAndWaitThread();  
			         
			         synchronized (myThread2) {
			             try {        
			                 myThread.start();
			                 // 主线程睡眠3s
			                 System.out.println("before wait");
			                 // 阻塞主线程
			                 myThread2.wait();
			                 System.out.println("after wait");
			             } catch (InterruptedException e) {
			                 e.printStackTrace();
			             }            
			         }        
			     }
}