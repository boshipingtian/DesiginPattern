package com.example.打印零与奇偶数_1116;

import java.util.function.IntConsumer;

/**
 * synchronized 超时
 */
class ZeroEvenOdd1 {

    private int n;

    private volatile int count = 1;
    private volatile int flag = 0;

    public ZeroEvenOdd1(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (flag != 0) {
                wait();
            }
            printNumber.accept(0);
            flag = count % 2 == 0 ? 2 : 1;
            notifyAll();
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (flag != 2) {
                wait();
            }
            printNumber.accept(count);
            count++;
            if(count > n){
                return;
            }
            flag = 0;
            notifyAll();
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (flag != 1) {
                wait();
            }
            printNumber.accept(count);
            count++;
            if(count > n){
                return;
            }
            flag = 0;
            notifyAll();
        }
    }
}