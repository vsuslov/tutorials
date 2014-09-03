/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory.pizzaz;

import ru.rs.tut.patterns.factory.iFactory.IngridientFactory;

/**
 *
 * @author Admin
 */
public class VeggiePizza extends IPizza {

    IngridientFactory iFactory;

    public VeggiePizza(IngridientFactory iFactory) {
        this.iFactory = iFactory;
    }

    @Override
    public void prepare() {
        dough = iFactory.createDough();
        cheese = iFactory.createCheese();
        vegs = iFactory.createVegs();
    }

}
