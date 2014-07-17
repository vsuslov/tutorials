/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class PointDao implements GeneralDao<Point> {

    private final String SELECTALL = "SELECT ID,X,Y from Points";
    private final String INSERT = "INSERT X,Y,PROJECT INTO Points VALUES (?,?,'firstProj')";
    JdbcHelper helper;
    Connection connection;

    public PointDao() {
        helper = new JdbcHelper();
        connection = helper.getConnection();
        try {
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(PointDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Point> selectAll() {
        List<Point> result = new ArrayList<>();
        if (connection != null) {
            try (Statement statement = connection.createStatement()) {
                ResultSet rs = statement.executeQuery(SELECTALL);
                while (rs.next()) {
                    Point point = new Point(rs.getInt("ID"));
                    point.setX(rs.getDouble("X"));
                    point.setY(rs.getDouble("Y"));
                    point.setProject(rs.getString("project"));
                    result.add(point);
                }
            } catch (SQLException ex) {
                Logger.getLogger(PointDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Connection is NULL");
        }
        return result;
    }

    @Override
    public void add(Point object) {
        if (connection != null) {
            try (PreparedStatement st = connection.prepareStatement(INSERT)) {
                st.setDouble(1, object.getX());
                st.setDouble(2, object.getY());
                ResultSet rs = st.executeQuery(INSERT);

            } catch (SQLException ex) {
                Logger.getLogger(PointDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
