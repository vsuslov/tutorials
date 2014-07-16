/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.concur;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Adder {

    private Collection<Integer> collection;
    private final Random random = new Random();
    private String name;

    public Adder(Collection<Integer> c) {
        collection = c;
        name = "Thread" + random.nextInt(10);
    }

    public synchronized void increment() {
        collection.add(random.nextInt(100));
    }

    public synchronized Integer decrement() {
        Iterator itr = collection.iterator();
        Integer result = (Integer) itr.next();
        itr.remove();
        return result;
    }
}
