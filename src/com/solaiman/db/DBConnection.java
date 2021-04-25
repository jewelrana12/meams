package com.solaiman.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    public static Connection con = null;

    public static Connection connect() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://38.109.112.119:3306/db_admin", "adweb", "miniroot@23");
            System.out.println("success");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
         return con;
    }
    public static void main(String[] args) {
        //connect();
        getData(connect(),"04/02/2019");
    }
   public static String getData(Connection con,String target_date){
        
       PreparedStatement pst;
       ResultSet rs;
       String date = null;
       //System.out.println(target_date);
       
       String sql = "select * from tbl_start where cdate = \'"+target_date+"\'";
       try{ pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()){          
             date = rs.getString("subjectotp");
            //System.out.println(date);
        }
       }catch(Exception e){
           
       }
       
       return date;
   }
}
