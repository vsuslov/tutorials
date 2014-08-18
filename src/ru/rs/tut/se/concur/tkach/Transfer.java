/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.concur.tkach;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class Transfer implements Callable<Boolean> {

    BankAccount from, to;
    int amount;
    CountDownLatch latch;

    public Transfer(BankAccount from, BankAccount to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Transfer(BankAccount from, BankAccount to, int amount, CountDownLatch latch) {
        this(from, to, amount);
        this.latch = latch;
    }

    @Override
    public Boolean call() throws Exception {
        System.out.println("Waiting to start");
        latch.await();
        Boolean result = true;

        if (from.getLock().tryLock(3, TimeUnit.SECONDS)) {
            try {
                if (from.getBalance() < amount) {
                    throw new InsFundsException("Not Enough Money");
                }
                if (to.getLock().tryLock(3, TimeUnit.SECONDS)) {
                    try {
                        from.withdraw(amount);
                        Thread.sleep(new Random().nextInt(4000) + 1000);
                        to.deposit(amount);
                    } finally {
                        to.getLock().unlock();
                    }
                } else {
                    result = false;
                }
            } finally {
                from.getLock().unlock();
            }
        } else {
            from.incFailCounter();
            result = false;
        }
        return result;
    }

}
