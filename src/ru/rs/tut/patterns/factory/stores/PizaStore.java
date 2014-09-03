/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory.stores;

import ru.rs.tut.patterns.factory.pizzaz.IPizza;

/**
 *
 * @author Admin
 */
public abstract class PizaStore {

    public IPizza orderPizza() {
        IPizza pizza = createPizza();

        pizza.prepare();
        pizza.boxing();
        return pizza;
    }

    protected abstract IPizza createPizza();
}
