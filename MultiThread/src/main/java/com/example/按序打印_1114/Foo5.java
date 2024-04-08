package com.example.按序打印_1114;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用CountDownLatch实现按序打印
 */
public class Foo5 {

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition1 = lock.newCondition();
    private final Condition condition2 = lock.newCondition();
    
    private int A;

    public Foo5() {
        A = 1;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        lock.lock();
        try {
            printFirst.run();
            A = 2;
            condition1.signal();
        }finally {
            lock.unlock();
        }
        
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        lock.lock();
        try {
            while (A != 2){
                condition1.await();
            }
            printSecond.run();
            A = 3;
            condition2.signal();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        lock.lock();
        try {
            while (A != 3){
                condition2.await();
            }
            printThird.run();
        } finally {
            lock.unlock();
        }
    }
}
