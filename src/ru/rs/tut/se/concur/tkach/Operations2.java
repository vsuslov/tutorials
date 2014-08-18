/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.concur.tkach;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class Operations2 {

    public static void main(String[] args) {
        BankAccount a = new BankAccount(500);
        BankAccount b = new BankAccount(20);

        CountDownLatch latch = new CountDownLatch(1);

        ScheduledExecutorService ss = Executors.newSingleThreadScheduledExecutor();
        ss.scheduleAtFixedRate(() -> {
            System.out.println("A Fails:" + a.getFailCounter());
            System.out.println("B Fails:" + b.getFailCounter());
            System.out.println("A balance:" + a.getBalance());
            System.out.println("B balance:" + b.getBalance());
        }, 1000, 1000, TimeUnit.MILLISECONDS);

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i <= 5; i++) {
            int sum = 100;
            System.out.println("Sum:" + sum);
            service.submit(new Transfer(a, b, sum));
        }
        latch.countDown();
        service.shutdown();
//        ss.shutdown();

    }
}
