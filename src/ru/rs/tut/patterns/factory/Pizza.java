/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory;

/**
 *
 * @author Admin
 */
public class Pizza {

    private Dough dough;
    private Cheese cheese;

    public Pizza(Dough dough, Cheese cheese) {
        this.dough = dough;
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Pizza{" + "dough=" + dough + ", cheese=" + cheese + '}';
    }

}
