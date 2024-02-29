/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancobussiness;

import com.mycompany.bancodomain.Cliente;
import com.mycompany.bancopersistence.ClienteDAOImp;
import com.mycompany.bancopersistence.IClienteDAO;

/**
 *
 * @author luisp
 */
public class ClienteBussiness {
    IClienteDAO clienteDAO = new ClienteDAOImp();
    
    /**
     * 
     * @param cliente
     * @return 
     */
    public Cliente crear(Cliente cliente){
        
        clienteDAO.crear(cliente); 
        
        return cliente;
    }
}
