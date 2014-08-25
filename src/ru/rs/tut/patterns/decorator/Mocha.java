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
public class Mocha extends AbstractCondiment {

    public Mocha(Beverage b) {
        super(b);
        setDescription(beverage.getDescription() + " +Mocha");
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

}
