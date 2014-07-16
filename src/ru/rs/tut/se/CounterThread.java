/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se;

/**
 *
 * @author Admin
 */
public class CounterThread implements Runnable {

    private Counter cntr;
    public CounterThread(Counter c) {
        this.cntr=c;
    }
    
    
    @Override
    public void run() {
        cntr.inc();
    }
    
}
