/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.jdbc;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Program {

    public static void main(String[] args) {
        UserDao dao = new UserDaoImpl();
        try {
            List<User> list = dao.selectAll();
            list.stream().forEach((u) -> {
                System.out.println(u);
            });
        } catch (DBException e) {

        }
    }
}
