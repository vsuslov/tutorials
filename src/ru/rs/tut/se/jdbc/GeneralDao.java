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
 * @param <TYPE> type parameter
 *
 */
public interface GeneralDao<TYPE> {

    public List<TYPE> selectAll();

    public void add(TYPE object);

}
