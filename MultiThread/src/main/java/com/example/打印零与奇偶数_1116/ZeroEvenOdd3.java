package com.example.打印零与奇偶数_1116;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * 信号量
 */
class ZeroEvenOdd3 {
    private int n;
    private final Semaphore semaphore1 = new Semaphore(1);
    private final Semaphore semaphore2 = new Semaphore(0);
    private final Semaphore semaphore3 = new Semaphore(0);
    
    private volatile int flag = 0;
    
    public ZeroEvenOdd3(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            semaphore1.acquire();
            printNumber.accept(0);
            if ((i + 1) % 2 == 0) {
                semaphore2.release();
            } else {
                semaphore3.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i+=2) {
            semaphore2.acquire();
            printNumber.accept(i);
            semaphore1.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i+=2) {
            semaphore3.acquire();
            printNumber.accept(i);
            semaphore1.release();
        }
    }
}