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
public abstract class AbstractCondiment extends Beverage {

    public AbstractCondiment(Beverage b) {
        beverage = b;
    }
    Beverage beverage;
}
