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
public class Counter {
    int counter;
    public Counter() {
        counter=0;
    }
    
    public synchronized void inc() {
        counter++;
        System.out.println("Counter has been incremented:"+counter);
    }
    public void dec() {
        counter--;
        System.out.println("Counter has been decremented:"+counter);
    }
    public int value() {
        return counter;
    }
    
}
