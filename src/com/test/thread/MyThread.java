package com.test.thread;

import java.util.concurrent.locks.Lock;

class MyThread extends Thread {
    private Lock lock;
    public MyThread(String name, Lock lock) {
        super(name);
        this.lock = lock;
    }
    
    public void run () {
        lock.lock();
        System.out.println(Thread.currentThread() +"11111");
        lock.lock();
        System.out.println(Thread.currentThread() +"22222");
        try {
        	Thread.sleep(1000);
            System.out.println(Thread.currentThread() + " running");
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            lock.unlock();
            lock.unlock();
        }
    }
}

