package com.example.H2O生成_1117;

/**
 * synchronized 解法
 */
class H2O1 {
    
    private volatile int oflag = 0;
    private volatile int hflag = 0;
    
    public H2O1() {
    }

    public synchronized void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        while (hflag == 2){
            wait();
        }
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        hflag++;
        if(oflag == 1 && hflag == 2){
            oflag = 0;
            hflag = 0;
        }
        notifyAll();
    }

    public synchronized void oxygen(Runnable releaseOxygen) throws InterruptedException {
        while (oflag == 1){
            wait();
        }
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
		releaseOxygen.run();
        oflag++;
        if(oflag == 1 && hflag == 2){
            oflag = 0;
            hflag = 0;
        }
        notifyAll();
    }
}