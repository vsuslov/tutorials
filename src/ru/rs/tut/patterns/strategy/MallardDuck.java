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
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBeh = (() -> {
            System.out.println("I'flying!");
        });

        quackBeh = (() -> {
            System.out.println("Sorry but I cant quack");
        });
    }
}
