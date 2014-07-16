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
public interface UserDao {

    public List<User> selectAll() throws DBException;

    public int deleteById(int id) throws DBException;

    public void insert(User user) throws DBException;
}
