/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancobussiness;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author luisp
 */
public class Util {

    /*m
      Numero de cuenta aleatorio  
     */
    public static String generaNumCuenta() {
        Random ran = new Random();
        List<String> numeros = new LinkedList<>();
        String base = "1529";
        for (int i = 0; i < 12; i++) {
            int numero = ran.nextInt(9);

            numeros.add(String.valueOf(numero));

        }
        String numCuenta = String.join("", numeros);
        return base + numCuenta;

    }

    public static String generaNip() {
        Random ran = new Random();
        List<String> numeros = new LinkedList<>();

        for (int i = 0; i < 4; i++) {
            int numero = ran.nextInt(9);

            numeros.add(String.valueOf(numero));

        }
        String nip = String.join("", numeros);
        return nip;

    }

    public static void main(String[] args) {
        Util util = new Util();
        System.out.println("Tu numero de cuenta es: " + util.generaNumCuenta());
        System.out.println("Tu nip es: " + util.generaNip());
    }
}
