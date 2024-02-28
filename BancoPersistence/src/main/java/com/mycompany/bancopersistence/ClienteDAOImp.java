/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancopersistence;

import com.mycompany.bancodomain.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luisp
 */
public class ClienteDAOImp implements IClienteDAO {

    ConnectionMYSQL connectionMYSQL;

    public Cliente crear(Cliente cliente) {

        try {
            Statement createStatement = getConnection().createStatement();
            ResultSet resultSet = createStatement.executeQuery("INSERT INTO CLIENTE(NOMBRE, APELLIDOS, ID_DOMICILIO, EDAD, FECHA_NACIMIENTO, CURP) VALUES('LUIS', 'CONTRERAS', 1, 20, CURRENT_DATE, 'COPL030607HSRNRSA9');");
            return null;
        }catch(SQLException sqlException){
            sqlException.printStackTrace();
        }
        return cliente;
    }

    public Connection getConnection() {
        try {
            return connectionMYSQL.createConnection();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }
}
