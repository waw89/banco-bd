/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodomain;

/**
 *
 * @author luisp
 */
public class RetiroSinCuenta extends Operacion {
    
    private long id;
    private int claveRetiro;

    public RetiroSinCuenta() {
    }

    public RetiroSinCuenta(long id, int claveRetiro) {
        this.id = id;
        this.claveRetiro = claveRetiro;
    }


    public RetiroSinCuenta(long id, int claveRetiro, Cuenta cuentaEmisora, Cliente clienteEmisor, float monto) {
        super(cuentaEmisora, clienteEmisor, monto);
        this.id = id;
        this.claveRetiro = claveRetiro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getClaveRetiro() {
        return claveRetiro;
    }

    public void setClaveRetiro(int claveRetiro) {
        this.claveRetiro = claveRetiro;
    }

    @Override
    public String toString() {
        return "RetiroSinCuenta{" + "id=" + id + ", claveRetiro=" + claveRetiro + '}';
    }
    
}
