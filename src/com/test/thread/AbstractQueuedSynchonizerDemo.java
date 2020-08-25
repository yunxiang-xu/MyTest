package com.test.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AbstractQueuedSynchonizerDemo {

			 public static void main(String[] args) throws InterruptedException {
			        Lock lock = new ReentrantLock();
			        
			        MyThread t1 = new MyThread("t1", lock);
			        MyThread t2 = new MyThread("t2", lock);
			        t1.start();
			        Thread.sleep(500);
			        t2.start();    
			    }
}
