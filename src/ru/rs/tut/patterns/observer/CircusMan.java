package ru.rs.tut.patterns.observer;

import java.util.Observable;

/**
 * Created by Admin on 19.08.2014.
 */
public class CircusMan extends Observable {
    private Point p;
    public CircusMan() {

    }

      public void touch() {
          p=new Point(1,2);
          setChanged();
          notifyObservers(p);
      }

}
