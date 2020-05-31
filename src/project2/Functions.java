/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MOH
 */
public class Functions {

    public static String resCustomer(Connection conn, int id) {
        ResultSet resCustomer = conn.selectStmt("*", "customers", "id = " + Login.id);
        try {

            if (resCustomer.first()) {

                return "<html> Name : " + resCustomer.getString("name") + "<br/> Age : " + resCustomer.getString("age") + "<br/> Phone : " + resCustomer.getString("phoneNumber") + "<br/> Balance : " + resCustomer.getString("balance") + "</html>";
            }

        } catch (SQLException ex) {
           System.out.println(""+ex.getMessage());
        }
        return null;
    }

    public static String resUser(Connection conn, int id) {
        ResultSet resUser = conn.selectStmt("*", "users", "id = " + Login.id);
        try {

            if (resUser.first()) {

                return "<html> Name : " + resUser.getString("name") + "<br/> Age : " + resUser.getString("age") + "<br/> Phone : " + resUser.getString("phoneNumber") + "</html>";
            }

        } catch (SQLException ex) {
            System.out.println(""+ex.getMessage());
        }
        return null;
    }

    public static void logFile(String text) {
        File file = new File("D:\\logFile.txt");

        try {

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileWriter fw = new FileWriter("D:\\logFile.txt", true);
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();

            fw.write(text + "                       " + dateFormat.format(date) + "\n\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }

    public static String checkInput(String id, String age, String phone) {
        try {
            Integer.parseInt(id);
            Integer.parseInt(age);
            Integer.parseInt(phone);
        } catch (Exception e) {
            return e.getMessage();
        }
        return null;
    }
//
//    public static ResultSet CheckIsExist(int id) {
//        Connection conn = new Connection();
//        ResultSet res = null;
//        try {
//           
//            res = conn.selectStmt("id ,name , COUNT(*)  AS 'rowcount' ", "users", "id = " + id);
//        } catch (Exception e) {
//            e.getMessage();
//        }
//
//        return res;
//    }

    public static void main(String[] args) {
      
    }
}
