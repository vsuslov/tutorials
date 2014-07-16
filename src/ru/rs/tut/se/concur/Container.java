/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se.concur;

/**
 *
 * @author Admin
 */
public class Container {
    Double i;
    public Container(Double d) {
        this.i=d;
    }
    
    public synchronized void dbl(){
        i*=2;
    }
    
    public Double get() {
        return i;
    }
}
