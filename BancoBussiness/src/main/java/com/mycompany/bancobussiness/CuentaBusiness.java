/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancobussiness;

import com.mycompany.bancodomain.Cliente;
import com.mycompany.bancodomain.Cuenta;
import java.time.LocalDate;

/**
 *
 * @author luisp
 */
public class CuentaBusiness {
    
    
    public Cuenta crear(Cliente cliente){
        
        Cuenta cuenta = new Cuenta(); 
        cuenta.setNumeroCuenta(Util.generaNumCuenta());
        cuenta.setNip(Util.generaNip());
        cuenta.setSaldo(0);
        cuenta.setCliente(cliente);
        cuenta.setFechaApertura(LocalDate.now());
        return null;
    }
}
