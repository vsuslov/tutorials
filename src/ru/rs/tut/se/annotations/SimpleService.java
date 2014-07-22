/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.annotations;

/**
 *
 * @author Admin
 */
@Service(name = "SuperServis")
public class SimpleService {

    @init
    public void initService() {
        System.out.println("Service class");
    }

    public void secondMethod() {
        System.out.println("Second Method");
    }
}
