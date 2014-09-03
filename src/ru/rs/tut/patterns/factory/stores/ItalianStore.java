/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory.stores;

import ru.rs.tut.patterns.factory.CheesePizza;
import ru.rs.tut.patterns.factory.iFactory.ItalianIngridientFactory;
import ru.rs.tut.patterns.factory.pizzaz.IPizza;

/**
 *
 * @author Admin
 */
public class ItalianStore extends PizaStore {

    @Override
    protected IPizza createPizza() {
        ItalianIngridientFactory iFactory = new ItalianIngridientFactory();

        CheesePizza pizza = new CheesePizza(iFactory);
        return pizza;
    }

}
