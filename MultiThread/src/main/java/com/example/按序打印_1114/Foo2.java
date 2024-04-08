package com.example.按序打印_1114;

/**
 * 使用synchronized 对象 和标志位实现按序打印
 */
public class Foo2 {
    private int A;
    private final Object object;
    
    public Foo2() {
        object = new Object();
        A = 1;
    }
    
    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized (object){
            printFirst.run();
            A = 2;
            object.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized (object){
            while (A!=2){
                object.wait();
            }
            printSecond.run();
            A = 3;
            object.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized (object){
            while (A!=3){
                object.wait();
            }
            printThird.run();
            object.notifyAll();
        }
    }
    
}
