package com.example.按序打印_1114;

import java.util.concurrent.Semaphore;

/**
 * 使用Semaphore实现按序打印
 */
public class Foo3 {

    private final Semaphore semaphore1 = new Semaphore(0);
    private final Semaphore semaphore2 = new Semaphore(0);

    public Foo3() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        semaphore1.release(1);
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        semaphore1.acquire();
        printSecond.run();
        semaphore2.release(1);
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        semaphore2.acquire();
        printThird.run();
    }
}
