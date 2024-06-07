/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author PC
 */
public class SQLSeverDataProvider {
    private  Connection connection;
    private String sqlServer = "";
    private String datebase = "";
    
          
    public void open()           
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conString = "jdbc:sqlserver://" + sqlServer +":1433;databaseName="+datebase+";user = sa; password = 123";
            connection = DriverManager.getConnection(conString);
            System.out.println("Ket noi thanh cong");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
            }
    public void close(){
        try {
            this.connection.close();
        } catch (Exception e) {
             System.err.println(e);           
        }
    }
    public ResultSet excuteQuery(String sql){
        ResultSet rs = null;
        try {
            Statement sm = connection.createStatement();
            rs = sm.executeQuery(sql);
        } catch (Exception e) {
            System.err.println(e);  
        }
        return rs;
    }
    public int excuteUpdate(String sql){
        int n =-1;
        try {
            Statement sm = connection.createStatement();
            n = sm.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e);  
        }
        return n;
    }
}
