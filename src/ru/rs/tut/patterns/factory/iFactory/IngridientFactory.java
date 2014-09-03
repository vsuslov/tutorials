/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory.iFactory;

import ru.rs.tut.patterns.factory.ingridients.IDough;
import ru.rs.tut.patterns.factory.ingridients.IVegs;
import ru.rs.tut.patterns.factory.ingridients.ICheese;

/**
 *
 * @author Admin
 */
public interface IngridientFactory {

    public ICheese createCheese();

    public IDough createDough();

    public IVegs[] createVegs();
}
