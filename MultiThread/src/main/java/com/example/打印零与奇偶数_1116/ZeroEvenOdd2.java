package com.example.打印零与奇偶数_1116;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * ReentrantLock + Condition 成功
 */
class ZeroEvenOdd2 {

    private int n;

    private volatile int flag = 0;
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static final Condition CONDITION = LOCK.newCondition();

    public ZeroEvenOdd2(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            LOCK.lock();
            try {
                while (flag != 0) {
                    CONDITION.await();
                }
                printNumber.accept(0);
                flag = (i + 1) % 2 == 0 ? 2 : 1;
                CONDITION.signalAll();
            } finally {
                LOCK.unlock();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            LOCK.lock();
            try {
                while (flag != 2) {
                    CONDITION.await();
                }
                flag = 0;
                printNumber.accept(i);
                CONDITION.signalAll();
            } finally {
                LOCK.unlock();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            LOCK.lock();
            try {
                while (flag != 1) {
                    CONDITION.await();
                }
                flag = 0;
                printNumber.accept(i);
                CONDITION.signalAll();
            } finally {
                LOCK.unlock();
            }
        }
    }
}