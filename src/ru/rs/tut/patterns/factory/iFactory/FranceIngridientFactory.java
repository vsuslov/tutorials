/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory.iFactory;

import ru.rs.tut.patterns.factory.ingridients.FranceDough;
import ru.rs.tut.patterns.factory.ingridients.Salad;
import ru.rs.tut.patterns.factory.ingridients.Parmezan;
import ru.rs.tut.patterns.factory.ingridients.Potatoe;
import ru.rs.tut.patterns.factory.ingridients.IDough;
import ru.rs.tut.patterns.factory.ingridients.IVegs;
import ru.rs.tut.patterns.factory.ingridients.ICheese;

/**
 *
 * @author Admin
 */
public class FranceIngridientFactory implements IngridientFactory {

    @Override
    public ICheese createCheese() {
        return new Parmezan();
    }

    @Override
    public IDough createDough() {
        return new FranceDough();
    }

    @Override
    public IVegs[] createVegs() {
        IVegs vegs[] = {new Potatoe(), new Salad()};
        return vegs;
    }

}
