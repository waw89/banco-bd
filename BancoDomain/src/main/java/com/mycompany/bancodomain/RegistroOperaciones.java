/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodomain;

/**
 *
 * @author luisp
 */
public class RegistroOperaciones {
    private long idRegistroOperaciones;
    private long idCuenta;
    private long idOperacion;

    public RegistroOperaciones(long idRegistroOperaciones, long idCuenta, long idOperacion) {
        this.idRegistroOperaciones = idRegistroOperaciones;
        this.idCuenta = idCuenta;
        this.idOperacion = idOperacion;
    }

    public RegistroOperaciones() {
    }

    public long getIdRegistroOperaciones() {
        return idRegistroOperaciones;
    }

    public void setIdRegistroOperaciones(long idRegistroOperaciones) {
        this.idRegistroOperaciones = idRegistroOperaciones;
    }

    public long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public long getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(long idOperacion) {
        this.idOperacion = idOperacion;
    }

    @Override
    public String toString() {
        return "RegistroOperaciones{" + "idRegistroOperaciones=" + idRegistroOperaciones + ", idCuenta=" + idCuenta + ", idOperacion=" + idOperacion + '}';
    }
    
    
}
