/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory.iFactory;

import ru.rs.tut.patterns.factory.ingridients.ItalianDough;
import ru.rs.tut.patterns.factory.ingridients.Lamber;
import ru.rs.tut.patterns.factory.ingridients.IDough;
import ru.rs.tut.patterns.factory.ingridients.IVegs;
import ru.rs.tut.patterns.factory.ingridients.ICheese;

/**
 *
 * @author Admin
 */
public class ItalianIngridientFactory implements IngridientFactory {

    @Override
    public ICheese createCheese() {
        return new Lamber();
    }

    @Override
    public IDough createDough() {
        return new ItalianDough();
    }

    @Override
    public IVegs[] createVegs() {
        return null;
    }

}
