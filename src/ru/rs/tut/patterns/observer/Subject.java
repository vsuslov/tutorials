/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.observer;

/**
 *
 * @author Admin
 */
public interface Subject {

    public void register();

    public void remove();

    public void notifyObservers();
}
