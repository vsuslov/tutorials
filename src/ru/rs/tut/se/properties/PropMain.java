/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Admin
 */
public class PropMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    Properties props=new Properties();
    props.setProperty("coco", "trololo");
    
    props.store(new FileOutputStream("props.txt"), "cococo");
    
    props=new Properties();
    props.load(new FileInputStream("props.txt"));
        props.store(System.out, "lolo");
    }

    
    
}
