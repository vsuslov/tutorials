/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory.stores;

import ru.rs.tut.patterns.factory.iFactory.FranceIngridientFactory;
import ru.rs.tut.patterns.factory.pizzaz.VeggiePizza;
import ru.rs.tut.patterns.factory.pizzaz.IPizza;

/**
 *
 * @author Admin
 */
public class FranceStore extends PizaStore {

    @Override
    protected IPizza createPizza() {
        FranceIngridientFactory iFactory = new FranceIngridientFactory();
        VeggiePizza pizza = new VeggiePizza(iFactory);
        return pizza;
    }

}
