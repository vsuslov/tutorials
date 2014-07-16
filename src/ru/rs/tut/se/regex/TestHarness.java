/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se.regex;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class TestHarness {
    public void run() {
         Console console=System.console();
        
        if(console==null) {
            System.err.println("No console here :/");              
            System.exit(1);
        }
        Pattern pattern;
        Matcher matcher;
        while(true) {
            pattern=Pattern.compile(console.readLine("Enter pattern:"));
            matcher=pattern.matcher(console.readLine("Enter String for check:"));
            
            boolean found=false;
            while(matcher.find()) {             
                console.format("found a string match:"
                        + " %s from index %d to index %d%n",//
                        matcher.group(),//
                        matcher.start(),//
                        matcher.end());
                found=true;
            }
            if(!found) {
                System.err.println("Matches not Found");
            }
        }
    }
}
