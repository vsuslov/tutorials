/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.concur.rs;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Admin
 */
public class Counter implements Runnable {

    private int name;
    private final Random random = new Random();
    private CountDownLatch start;
    private Semaphore semafor;

    public Counter(int name) {
        this.name = name;
    }

    public Counter(int name, CountDownLatch startLatch) {
        this(name);
        start = startLatch;
    }

    public Counter(int name, Semaphore semaphore) {
        this(name);
        this.semafor = semaphore;
    }

    @Override
    public void run() {

//        System.out.println(name + ": Waiting for start...");
        try {
            semafor.acquire();
//            start.await();
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + ":" + i);

                Thread.sleep(random.nextInt(3 * 1000) + 1000);
            }
        } catch (InterruptedException ie) {
            System.err.println(name + ":interrupted");
        } finally {
            semafor.release();
        }
    }

}
