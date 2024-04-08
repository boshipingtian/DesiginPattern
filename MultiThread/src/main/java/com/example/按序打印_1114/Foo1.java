package com.example.按序打印_1114;

/**
 * 使用synchronized和标志位实现按序打印
 */
public class Foo1 {
    
    private static int A;

    public Foo1() {
        A = 1;
    }
    
    public synchronized void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        A = 2;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (A !=2 ){
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        A = 3;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (A != 3){
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        notifyAll();
    }
    
}
