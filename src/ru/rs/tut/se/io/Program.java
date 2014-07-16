/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ru.rs.tut.se.lambda.Person;

/**
 *
 * @author Admin
 */
public class Program {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person("Vadik");
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("lolo.txt"));

        stream.writeObject(p);
        stream.flush();
        stream.close();

        ObjectInputStream str = new ObjectInputStream(new FileInputStream("lolo.txt"));
        Person pp = (Person) str.readObject();
        System.out.println(pp);
        str.close();
    }
}
