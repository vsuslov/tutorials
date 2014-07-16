/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.lambda;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Person implements Serializable {

    enum Sex {

        MALE, FEMALE, FAGGOT;

    }
    private String name;
    private LocalDate birthday;
    private Sex gender;

    public Person(String name) {
        Random rnd = new Random();
        this.name = name;
        this.birthday = LocalDate.of(rnd.nextInt(50) + 1950, rnd.nextInt(12) + 1, rnd.nextInt(25) + 1);

        int prob = rnd.nextInt(100);
        gender = (prob > 50) ? Sex.MALE ://
                (prob < 50) ? Sex.FEMALE ://
                Sex.FAGGOT;

    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.getName());
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthday=" + birthday + ", gender=" + gender + "}\n\r";
    }

}
