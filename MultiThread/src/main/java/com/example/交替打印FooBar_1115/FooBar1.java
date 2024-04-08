package com.example.交替打印FooBar_1115;

import java.util.concurrent.Semaphore;

/**
 * 信号量
 */
class FooBar1 {
    private int n;
    private java.util.concurrent.Semaphore semaphore1 = new Semaphore(1);
    private java.util.concurrent.Semaphore semaphore2 = new Semaphore(0);
    
    public FooBar1(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            semaphore1.acquire();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            semaphore2.release(1);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            semaphore2.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            semaphore1.release();
        }
    }
}