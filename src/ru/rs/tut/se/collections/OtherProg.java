package ru.rs.tut.se.collections;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by Admin on 02.07.2014.
 */
public class OtherProg {
    public static void main(String[] args) {
        Map<String, String> map=new WeakHashMap<>();

        for(int i=0;i<10;i++) {
            map.put("key_"+i,"value_"+i);
        }
        while(true) {
            System.out.println(map);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
