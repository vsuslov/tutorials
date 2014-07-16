/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class OtherMain {

    public static List<Person> listOfPerson = new ArrayList<>();
    public static List<Integer> listOfInt = new ArrayList<>();

    public static void init() {
        for (int i = 0; i < 5; i++) {
            listOfPerson.add(new Person("Name_" + i));
        }
    }

    public static void init2(int a) {
        for (int i = a; i >= 0; i--) {
            listOfInt.add(i);
        }
    }

    public static void insertSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j) < list.get(j - 1)) {
                    Integer tmp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, tmp);

                } else {
                    break;
                }
            }
        }
    }

    public static void sort(List<Integer> list) {
        int n = list.size();
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {

            for (int i = h; i < n; i++) {

                for (int j = i; j >= h && list.get(j) < list.get(j - h); j -= h) {
                    Integer tmp = list.get(j);
                    list.set(j, list.get(j - h));
                    list.set(j - h, tmp);
                }

            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        init2(10000000);

        Long start = System.currentTimeMillis();
//        insertSort(listOfInt);
        sort(listOfInt);
        System.out.println(System.currentTimeMillis() - start);

//        // List<Person> listOfMale = listOfPerson.stream().filter(e -> e.getGender().equals(Person.Sex.MALE)).collect(Collectors.toList());
//        Map<Person.Sex, Double> map
//                = listOfPerson.stream()
//                .collect(Collectors.groupingBy(
//                                Person::getGender, Collectors.averagingInt(Person::getAge)));
//        System.out.println(listOfPerson);
//        System.out.println(map);
//        // System.out.println(listOfMale);
    }

}
