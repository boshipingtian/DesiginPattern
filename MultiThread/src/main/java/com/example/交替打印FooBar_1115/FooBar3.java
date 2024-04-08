package com.example.交替打印FooBar_1115;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock
 */
class FooBar3 {
    private int n;
    
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition1 = lock.newCondition();
    private final Condition condition2 = lock.newCondition();
    private boolean A = false;
    

    public FooBar3(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            lock.lock();
            try {
                while (A){
                    condition1.await();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                A = true;
                condition2.signal();
            } finally {
                lock.unlock();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            lock.lock();
            try {
                while (!A){
                    condition2.await();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                A = false;
                condition1.signal();
            }finally {
                lock.unlock();
            }
            
        }
    }
}