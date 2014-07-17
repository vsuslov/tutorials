/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.jdbc;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class Program {

    public static void main(String[] args) {
        GeneralDao<Point> dao = new PointDao();

        Point p = new Point(2);
        p.setX(1);
        p.setY(3);
        dao.add(p);
        List<Point> points = dao.selectAll();
        System.out.println(points.stream().collect(Collectors.counting()).intValue());

    }
}
