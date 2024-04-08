package com.example.交替打印FooBar_1115;

import org.junit.jupiter.api.Test;

class FooBarTest {

    @Test
    public void test1() {
        FooBar1 fooBar = new FooBar1(4);
        new Thread(() -> {
            try {
                fooBar.foo(() -> System.out.print("Foo"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                fooBar.bar(() -> System.out.print("Bar"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    @Test
    public void test2() {
        FooBar2 fooBar = new FooBar2(4);
        new Thread(() -> {
            try {
                fooBar.foo(() -> System.out.print("Foo"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                fooBar.bar(() -> System.out.print("Bar"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    @Test
    public void test3() {
        FooBar3 fooBar = new FooBar3(4);
        new Thread(() -> {
            try {
                fooBar.foo(() -> System.out.print("Foo"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                fooBar.bar(() -> System.out.print("Bar"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}