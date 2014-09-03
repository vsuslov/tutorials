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
public class DoSmthCommand implements Command {

    Executer executer;

    public DoSmthCommand(Executer executer) {
        this.executer = executer;
    }

    @Override
    public void execute() {

        executer.doSomething();
    }

}
