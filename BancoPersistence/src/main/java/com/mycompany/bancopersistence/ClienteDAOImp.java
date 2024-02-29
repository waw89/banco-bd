/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancopersistence;

import com.mycompany.bancodomain.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luisp
 */
public class ClienteDAOImp implements IClienteDAO {
    
    Connection connectionMYSQL = ConnectionMYSQL.getInstance();

  public Cliente crear(Cliente cliente) {
    try {
        Statement createStatement = connectionMYSQL.createStatement();
        
        String sql = String.format("INSERT INTO CLIENTE(NOMBRE, APELLIDOS, ID_DOMICILIO, EDAD, FECHA_NACIMIENTO, CURP) VALUES ('%s', '%s', %d, %d, '%s', '%s')", 
                            cliente.getNombre(), cliente.getApellidos(), cliente.getDomicilio().getId(), cliente.getEdad(), 
                            new Date(cliente.getFechaNacimiento().getYear(), cliente.getFechaNacimiento().getMonth(), cliente.getFechaNacimiento().getDate()), cliente.getCurp());
       
        int result = createStatement.executeUpdate(sql);
        
        if (result > 0) {
            System.out.println("Insert successful");
        } else {
            System.out.println("Insert failed");
        }

    } catch(SQLException sqlException) {
        sqlException.printStackTrace();
    }
    return cliente;
}



}
