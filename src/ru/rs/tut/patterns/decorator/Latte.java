/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.decorator;

/**
 *
 * @author Admin
 */
public class Latte extends Beverage {

    public Latte() {
        setDescription("Latte");
    }

    @Override
    public double cost() {
        return 1.29;
    }

}
