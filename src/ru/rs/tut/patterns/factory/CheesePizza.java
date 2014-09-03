/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory;

import ru.rs.tut.patterns.factory.iFactory.IngridientFactory;
import ru.rs.tut.patterns.factory.pizzaz.IPizza;

/**
 *
 * @author Admin
 */
public class CheesePizza extends IPizza {

    IngridientFactory iFactory;

    public CheesePizza(IngridientFactory iFacory) {
        this.iFactory = iFacory;
    }

    @Override
    public void prepare() {
        dough = iFactory.createDough();
        cheese = iFactory.createCheese();
    }

}
