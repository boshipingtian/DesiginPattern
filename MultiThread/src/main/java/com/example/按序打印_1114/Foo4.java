package com.example.按序打印_1114;

import java.util.concurrent.CountDownLatch;

/**
 * 使用CountDownLatch实现按序打印
 */
public class Foo4 {

    private final java.util.concurrent.CountDownLatch latch1 = new CountDownLatch(1);
    private final java.util.concurrent.CountDownLatch latch2 = new CountDownLatch(1);

    public Foo4() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        latch1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        latch1.await();
        printSecond.run();
        latch2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        latch2.await();
        printThird.run();
    }
}
