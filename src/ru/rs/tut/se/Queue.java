/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se;

/**
 *
 * @author Admin
 * @param <Item> item
 */
public class Queue<Item> {
    
    Node first,last;
    
    class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty() {
       return first==null; 
    }
    
    public void enQueue(Item item) {
      Node oldLast=last;
      last=new Node();
      last.item=item;
      last.next=null;
      if(isEmpty()) {
          first=last;
      } else {
           oldLast.next=last;
      }
    }
    
    public Item deQueue() {
      if(isEmpty()) {
          System.out.println("EMPTY!");
          return null;
      }
      Item item=first.item;
      first=first.next;
      if(isEmpty()){
          last=null;
      }
      return item;
    }
}
