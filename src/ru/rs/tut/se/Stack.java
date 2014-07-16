/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.rs.tut.se;

/**
 *
 * @author Admin
 * @param <Item> Item
 */
public class Stack<Item> {
    Node first=null;
    
  private class Node {
      Item item;
      Node next;
      
      public Node(Item item) {
          this.item=item;
          next=first;
      }
  }
    
  public void push(Item item) {
      first=new Node(item);
  }
  public Item pop() {
      Item result=null;
      if(!isEmpty()) {
          result=first.item;
          first=first.next;
      }
      return result;
  }
  
  public boolean isEmpty() {
      return first==null;
  }
}
