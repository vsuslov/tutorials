/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.concur.rs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Admin
 */
public class Program {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Semaphore semafor = new Semaphore(1);

        int n = 10;

        for (int i = 0; i < n; i++) {
            new Thread(new Counter(i + 1, semafor)).start();
        }
        try {
            Thread.sleep(5000);
            semafor.release(3);
        } catch (InterruptedException ie) {
        }
//        ExecutorService service = Executors.newFixedThreadPool(2);
//        try {
//            for (int i = 0; i < n; i++) {
//                service.submit(new Counter(i + 1, latch));
//                Thread.sleep(2000);
//                latch.countDown();
//
//            }
//
//        } catch (InterruptedException ie) {
//        }
//        service.shutdown();
    }
}
