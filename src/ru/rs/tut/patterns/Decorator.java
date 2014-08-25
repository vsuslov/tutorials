/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns;

import ru.rs.tut.patterns.decorator.Beverage;
import ru.rs.tut.patterns.decorator.Latte;
import ru.rs.tut.patterns.decorator.Mocha;
import ru.rs.tut.patterns.decorator.Whip;

/**
 *
 * @author Admin
 */
public class Decorator {

    public static void main(String[] args) {
        Beverage b = new Mocha(new Whip(new Mocha(new Latte())));

        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
