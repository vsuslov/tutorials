/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se.collections;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Program {
    static class QQ implements Comparable {
        public int a;
        private int b;
        public QQ(int a,int b) {
            this.a=a;
            this.b=b;
            rnd=new Random();
        }
        private Random rnd;
        public void change() {
          a=rnd.nextInt()*100;
          b=rnd.nextInt()*50;
        }
        @Override
        public String toString() {
            return "QQ[" +  a + ',' + b + ']';
        }

        @Override
        public int compareTo(Object o) {
            QQ obj=(QQ) o;
          return (this.a>obj.a)? 1:(this.a==obj.a)? 0:-1;
        }

    }
    public static void main(String[] args) {
     
    }

}
