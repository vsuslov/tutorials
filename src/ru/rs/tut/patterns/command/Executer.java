/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.command;

/**
 *
 * @author Admin
 */
public class Executer {

    public void prepare() {
        say("preparing");
    }

    public void doSomething() {
        say("doing something");
    }

    private void say(String s) {
        System.out.println(s);
    }
}
