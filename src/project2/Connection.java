/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {

    private java.sql.Connection conn = null;
    private Statement stat = null;

    public Connection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprojeect", "root", "");
            stat = conn.createStatement();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(""+ex.getMessage());
        }
    }

    public ResultSet selectStmt(String column, String table, String where) {
        ResultSet rs = null;
        try {

            PreparedStatement ps = conn.prepareStatement("select " + column + " from " + table + " where " + where);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;

    }

  

    public int UpdateStmt(String table, String colummWithValue ,String where) {
        int rs = 0;

        try {
            rs = stat.executeUpdate("update " + table + " set " + colummWithValue+" Where "+where);

        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;

    }
      

    public int deleteStmt(String table, String name) {
        int rs = 0;

        try {
            rs = stat.executeUpdate("delete from " + table + " where name = '" + name+"'");

        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;

    }

    public java.sql.Connection getConn() {
        return conn;
    }
}
