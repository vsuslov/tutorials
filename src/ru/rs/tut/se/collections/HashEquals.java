/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se.collections;

/**
 *
 * @author Admin
 */
public class HashEquals {
    private int a;
    private int b;
    
    public HashEquals(int a,int b) {
        this.a=a;
        this.b=b;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.a;
        hash = 83 * hash + this.b;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HashEquals other = (HashEquals) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        return true;
    }
    
    
}
