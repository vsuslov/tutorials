/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.singleton;

/**
 *
 * @author Admin
 */
public class MultiThreadSingleton {

    private volatile MultiThreadSingleton instance;

    private MultiThreadSingleton() {

    }

    public MultiThreadSingleton getInstance() {
        if (instance == null) {
            synchronized (MultiThreadSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }
}
