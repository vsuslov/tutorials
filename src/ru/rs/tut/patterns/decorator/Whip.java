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
public class Whip extends AbstractCondiment {

    public Whip(Beverage b) {
        super(b);
        setDescription(beverage.getDescription() + " +Whip");
    }

    @Override
    public double cost() {
        return 0.11 + beverage.cost();
    }

}
