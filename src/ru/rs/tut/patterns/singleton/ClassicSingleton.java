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
public class ClassicSingleton {

    private ClassicSingleton instance;

    private ClassicSingleton() {
    }

    public ClassicSingleton getInstance() {
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
