/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.rs.tut.se.concur.Container;
import ru.rs.tut.se.concur.Doubler;

/**
 *
 * @author Admin
 */
public class Program {

    public static void main(String[] args) {
        Container d=new Container(0.01);
        ExecutorService executor=Executors.newFixedThreadPool(5);
        executor.execute(new Doubler(d,1));
        executor.execute(new Doubler(d,2));
        executor.execute(new Doubler(d,3));
        executor.execute(new Doubler(d,4));
        executor.execute(new Doubler(d,5));
        executor.execute(new Doubler(d,6));
       while(true) {
           
           System.out.println("Main:"+d.get());
           
           if(d.get()>=1000){
               executor.shutdown();
               break;
           }
           try{
             Thread.sleep((new Random().nextInt(5000)));
           }
           catch(InterruptedException ie) {}
       }
      
    }
}
