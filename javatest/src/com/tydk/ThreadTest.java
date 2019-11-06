package com.tydk;

import java.util.concurrent.Callable;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("线程开始。。。。。。");
    }
}
