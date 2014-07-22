/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.annotations;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Program {

    static Map<String, Object> map = new HashMap<>();

    public static void main(String[] args) {
        loadService("ru.rs.tut.se.annotations.SimpleService");
        loadService("ru.rs.tut.se.annotations.LazyService");

    }

    static void loadService(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            if (clazz.isAnnotationPresent(Service.class)) {
                if (!clazz.getAnnotation(Service.class).lazyLoad()) {
                    Object service = clazz.newInstance();

                    map.put(className, service);
                    for (Method m : clazz.getDeclaredMethods()) {
                        if (m.isAnnotationPresent(init.class)) {
                            try {
                                m.invoke(service);
                            } catch (Exception e) {
                                init ann = m.getAnnotation(init.class);
                                if (ann.suppressException()) {
                                    System.err.println("ERROR!");
                                } else {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Lazy service");
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println("Annotation:" + ann.name() + " " + ann.lazyLoad());
            Method[] methods = service.getMethods();
            for (Method m : methods) {
                if (m.isAnnotationPresent(init.class)) {
                    System.out.println("INIT  METHOD:" + m.getName());
                }
            }
        } else {
            System.out.println("Service doesn't present");
        }

    }
}
