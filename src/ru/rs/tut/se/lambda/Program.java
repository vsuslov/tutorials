/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Program {
       static class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return ((Person)o1).getBirthday().compareTo(((Person)o2).getBirthday());
        }
        }
    public static void main(String[] args) {
     Person qq=new Person("xz");
     List<Person> persons=new ArrayList<>();
     for(int i=0;i<100;i++) {
         persons.add(new Person("Name"+i));
     }
     Collections.shuffle(persons, new Random());
        System.out.println(persons);
     Person[] personArr=persons.toArray(new Person[persons.size()]);
     Arrays.sort(personArr,Person::compareByName);
     
     for(Person p:personArr){
        System.out.println(p);
     }
    }
}
