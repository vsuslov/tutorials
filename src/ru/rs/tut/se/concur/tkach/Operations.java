/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.concur.tkach;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class Operations {

    static boolean t = false;

    public static void main(String[] args) throws InsFundsException, InterruptedException {
        BankAccount a = new BankAccount(100);
        BankAccount b = new BankAccount(50);
        new Thread(new Runnable() {

            public void run() {
                try {
                    transfer(a, b, 50);
                    System.out.println("A:" + a.getBalance());
                    System.out.println("B:" + b.getBalance());
                } catch (InsFundsException insE) {

                } catch (InterruptedException intE) {

                }
            }

        }).start();

        transfer(b, a, 10);
        while (!t) {
        }
        System.out.println("A:" + a.getBalance());
        System.out.println("B:" + b.getBalance());

    }

    private static void transfer(BankAccount a, BankAccount b, int amount) throws InsFundsException, InterruptedException {
        if (a.getBalance() < amount) {
            throw new InsFundsException("Not Enough Money");
        }

        if (a.getLock().tryLock(1, TimeUnit.SECONDS)) {
            try {
                if (b.getLock().tryLock(1500, TimeUnit.MILLISECONDS)) {
                    try {

                        a.withdraw(amount);
                        b.deposit(amount);
                    } finally {
                        b.getLock().unlock();
                    }
                } else {
                    b.incFailCounter();
                    System.out.println("не удалось получить доступ ко второму аккаунту");
                }
            } finally {
                a.getLock().unlock();
            }

        } else {
            a.incFailCounter();
            System.out.println("Не удалось получить доступ к первому аккаунту");
        }
        t = true;
    }
}
