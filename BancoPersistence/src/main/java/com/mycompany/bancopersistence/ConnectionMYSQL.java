/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancopersistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luisp
 */
public class ConnectionMYSQL{
    
    private static Connection connection;
    
    private ConnectionMYSQL(){}; 
    
    /**
     * Singleton method
     * @return Connection object
     * @throws SQLException 
     */
    public static Connection getInstance(){
        if(connection == null){
            try{
                 createConnection(); 
            }catch(SQLException e){
                
            }
          
        }else{
            assert true;
        }
        
        return connection; 
    }
    
    /**
     * Method to create the connection if it does not exist.
     * @throws SQLException 
     */
    private static void createConnection() throws SQLException {
        Connection connectionMySQL;
        try {
            connectionMySQL = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "adminadmin");
            connection = connectionMySQL;
            
            
        }   catch( SQLException sqlException){
            sqlException.printStackTrace();
        }
        
     
    }
    
    
}
