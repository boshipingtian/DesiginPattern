package com.example.交替打印FooBar_1115;

/**
 * synchronized
 */
class FooBar2 {
    private int n;
    
    private boolean b = false;

    public FooBar2(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while (b){
                wait();
            }
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            b = true;
            notifyAll();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while (!b){
                wait();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            b = false;
            notifyAll();
        }
    }
}