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
public class EagerSingleton {

    private EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public EagerSingleton getInstance() {
        return instance;
    }
}
