/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class Prog {

    public static void main(String[] args) {
        Long l = System.currentTimeMillis();
        List<Person> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(new Person("Name " + rnd.nextInt(100)));
        }

        System.out.println(list);

        Map<Person.Sex, List<Person>> map = new HashMap<>();
        list.stream().collect(Collectors.groupingBy(Person::getGender, Collectors.toList()));
        System.out.println(map.size());
    }
}
