/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.factory.pizzaz;

import ru.rs.tut.patterns.factory.ingridients.IDough;
import ru.rs.tut.patterns.factory.ingridients.IVegs;
import ru.rs.tut.patterns.factory.ingridients.ICheese;

/**
 *
 * @author Admin
 */
public abstract class IPizza {

    protected ICheese cheese;
    protected IDough dough;
    protected IVegs vegs[];

    public abstract void prepare();

    public void boxing() {
        System.out.println("boxing the pizza");
    }

    @Override
    public String toString() {
        return "IPizza{" + "cheese=" + cheese + ", dough=" + dough + ",vegs=" + vegs + '}';
    }

}
