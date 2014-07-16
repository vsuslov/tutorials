/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se.lambda;

import java.util.function.BiFunction;

/**
 *
 * @author Admin
 */
public class Calculator {
   public int doOperation(int a,int b,BiFunction<Integer,Integer,Integer> op){
       return op.apply(a, b);
   }
   
}
