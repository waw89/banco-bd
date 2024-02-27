/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancogui;

import com.mycompany.bancobussiness.ClienteBussiness;
import com.mycompany.bancodomain.Cliente;
import com.mycompany.bancodomain.Domicilio;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author luisp
 */
public class BancoGUI {

    public static void main(String[] args) {
        
        /**
         * 
         * A continuación el código de prueba para crear una cuenta
         * 
         */
        Domicilio domicilio = new Domicilio("Valle Escondido", "Entre valle triste y valle del sol", 85090, "Miravalle", "CASA BLANCA");
        Cliente cliente = new Cliente("Jesus", "Contreras", domicilio, 0, new Date(103, 5, 7), "COPL030607HSRNRSA9");
        
        
        ClienteBussiness clienteBs = new ClienteBussiness(); 
        
        clienteBs.crear(cliente);
        
    }
}
