/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns;

import ru.rs.tut.patterns.factory.Pizza;
import ru.rs.tut.patterns.factory.PizzaFactoryMethod;

/**
 *
 * @author Admin
 */
public class FactoryMethod {

    public static void main(String[] args) {
        PizzaFactoryMethod fm = new PizzaFactoryMethod();

        Pizza pizza = fm.createPizza();

        System.out.println(pizza);
    }
}
