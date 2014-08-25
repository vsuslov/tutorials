/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.strategy;

/**
 *
 * @author Admin
 */
public abstract class Duck {

    FlyBehavior flyBeh;
    QuackBehavior quackBeh;

    public void quack() {
        quackBeh.quack();
    }

    public void fly() {
        flyBeh.fly();
    }
}
