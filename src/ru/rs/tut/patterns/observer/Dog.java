package ru.rs.tut.patterns.observer;

import java.util.*;

/**
 * Created by Admin on 19.08.2014.
 */
public class Dog implements java.util.Observer {
    private Point p;
    private Observable obs;

    public Dog(Observable obs) {
        this.obs = obs;
        obs.addObserver(this);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        p=(Point) arg;
        System.out.println(p);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "p=" + p +
                '}';
    }
}
