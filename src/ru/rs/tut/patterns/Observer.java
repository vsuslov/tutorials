/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns;

import ru.rs.tut.patterns.observer.CircusMan;
import ru.rs.tut.patterns.observer.Dog;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Observer {

    public static void main(String[] args) {
        CircusMan man=new CircusMan();
        Dog dog=new Dog(man);
        Random rnd=new Random();
        while (true) {
           man.touch();
            try{
                Thread.sleep(rnd.nextInt(5000)+1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
