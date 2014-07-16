/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se.concur;


import java.util.Random;

/**
 *
 * @author Admin
 */
public class Doubler implements Runnable{
    private Container i;
    private Integer name;
    
    private Random r;
    public Doubler(Container i,int name) {
        this.i=i;
        this.name=name;
        r=new Random();
    }

    @Override
    public void run() {
        while(true) {
          i.dbl();
          System.out.println("Thread no"+name+": "+i.get());
              try {
                  Thread.sleep(r.nextInt(10000));
            }
            catch(InterruptedException ie) {
                System.err.println("Interrupted:/");
            }
        }
    }
    
    
}
