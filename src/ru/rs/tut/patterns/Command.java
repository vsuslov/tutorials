/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns;

import ru.rs.tut.patterns.command.DoSmthCommand;
import ru.rs.tut.patterns.command.Executer;
import ru.rs.tut.patterns.command.PrepareCommand;
import ru.rs.tut.patterns.command.Reciever;

/**
 *
 * @author Admin
 */
public class Command {

    public static void main(String[] args) {

        Executer executer = new Executer();
        Reciever reciever = new Reciever();

        PrepareCommand prepare = new PrepareCommand(executer);
        DoSmthCommand doCommand = new DoSmthCommand(executer);

        reciever.setCommand(prepare);
        reciever.go();

        reciever.setCommand(doCommand);
        reciever.go();
    }
}
