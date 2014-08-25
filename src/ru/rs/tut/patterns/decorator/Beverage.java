/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.patterns.decorator;

/**
 *
 * @author Admin
 */
public abstract class Beverage {

    private String description = "Unknown";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String descr) {
        description = descr;
    }
}
