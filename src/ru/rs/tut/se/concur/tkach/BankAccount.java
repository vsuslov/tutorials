/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.concur.tkach;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Admin
 */
public class BankAccount {

    private AtomicInteger failCounter = new AtomicInteger(0);
    private Lock lock;
    private int balance;

    public BankAccount(int initBalance) {
        this.balance = initBalance;
        lock = new ReentrantLock();
    }

    public void incFailCounter() {
        failCounter.incrementAndGet();
    }

    public int getFailCounter() {
        return failCounter.get();
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public Lock getLock() {
        return lock;
    }
}
