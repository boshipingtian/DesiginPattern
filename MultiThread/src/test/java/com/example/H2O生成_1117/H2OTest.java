package com.example.H2O生成_1117;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class H2OTest {

    @Test
    public void test1(){
        H2O1 h2O = new H2O1();

        new Thread(() -> {
            try {
                for (int i = 0; i < 4; i++) {
                    h2O.oxygen(() -> System.out.print("O"));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        
        new Thread(() -> {
            try {
                for (int i = 0; i < 8; i++) {
                    h2O.hydrogen(() -> System.out.print("H"));
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}