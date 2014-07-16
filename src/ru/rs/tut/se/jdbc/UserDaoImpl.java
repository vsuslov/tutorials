/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rs.tut.se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UserDaoImpl implements UserDao {

    private static String DRIVER_NAME = "org.apache.derby.jdbc.ClientDriver";

    public static synchronized void initDriver(String name) {
        try {
            Class.forName(name);
        } catch (ClassNotFoundException cnf) {

        }


    static {
        initDriver("org.apache.derby.jdbc.ClientDriver");
    }

    @Override
    public List<User> selectAll() throws DBException {
        System.out.println("using selectall");
        Connection connection = getConnection();
        if (connection != null) {
            System.out.println("gooooon");
        }
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            if (statement != null) {
                System.out.println("goon");
            }
            resultSet = statement.executeQuery("SELECT id,login,email FROM USERS");
            List<User> result = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String login = resultSet.getString("login");
                String email = resultSet.getString("email");
                User user = new User(id);
                user.setLogin(login);
                user.setEmail(email);
                System.out.println("User:" + user);
                result.add(user);
            }
            connection.commit();
            return result;
        } catch (SQLException de) {
            rbQuietly(connection);
        } finally {
            closeQuietly(resultSet);
            closeQuietly(statement);
            closeQuietly(connection);
        }
        return new ArrayList<>();
    }

    @Override
    public int deleteById(int id) throws DBException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(User user) throws DBException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Connection getConnection() throws DBException {
        try {
            return DriverManager.getConnection("jdbc:derby://localhost:1527/QQ", "root", "123");
        } catch (SQLException sql) {
            throw new DBException("can't get Connection", sql);
        }
    }

    private void rbQuietly(Connection c) {
        if (c != null) {
            try {
                c.rollback();
            } catch (SQLException sql) {

            }
        }
    }

    private void closeQuietly(AutoCloseable obj) {
        if (obj != null) {
            try {
                obj.close();
            } catch (Exception de) {

            }
        }
    }
}
