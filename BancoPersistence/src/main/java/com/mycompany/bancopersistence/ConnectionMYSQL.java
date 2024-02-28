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
public class ConnectionMYSQL {

    public Connection createConnection() throws SQLException {
        Connection connectionMySQL = null;
        try {
            connectionMySQL = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "adminadmin");
            return connectionMySQL;
            
            
        }   catch( SQLException sqlException){
            sqlException.printStackTrace();
        }
        
        return connectionMySQL;
    }
}
