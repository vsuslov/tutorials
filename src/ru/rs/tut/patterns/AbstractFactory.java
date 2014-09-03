/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns;

import ru.rs.tut.patterns.factory.stores.FranceStore;
import ru.rs.tut.patterns.factory.stores.ItalianStore;

/**
 *
 * @author Admin
 */
public class AbstractFactory {

    public static void main(String[] args) {
        FranceStore fStore = new FranceStore();

        ItalianStore iStore = new ItalianStore();

        System.out.println(fStore.orderPizza());

        System.out.println(iStore.orderPizza());
    }

}
