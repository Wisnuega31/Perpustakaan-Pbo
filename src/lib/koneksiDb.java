/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB 1_10
 */
public class koneksiDb {
    static Connection cn;
    static ResultSet rs ;
    static Statement st;
    
    public koneksiDb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpus_pbo","root","");
        } catch (ClassNotFoundException | SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    //METHOD AMBIL DATA
    public static ResultSet ambilData(String sql){
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
            return null;
        }
    }
    
    //METHOD UBAH DATA
    public static boolean ubahData(String sql){
        try {
            st = cn.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
            return false;
        }
    }
    
}
