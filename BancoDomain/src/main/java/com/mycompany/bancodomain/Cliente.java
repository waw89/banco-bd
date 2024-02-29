/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodomain;

import java.util.Date;

/**
 *
 * @author luisp
 */
public class Cliente {
    private long id;
    private String nombre;
    private String apellidos;
    private Domicilio domicilio;
    private int edad;
    private Date fechaNacimiento;
    private String curp;
    private Cuenta cuenta;
    public Cliente() {
    }

    public Cliente(long id, String nombre, String apellidos, Domicilio domicilio, int edad, Date fechaNacimiento, String curp, Cuenta cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.curp = curp;
        this.cuenta = cuenta;
    }

    public Cliente(String nombre, String apellidos, Domicilio domicilio, int edad, Date fechaNacimiento, String curp, Cuenta cuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.curp = curp;
        this.cuenta = cuenta;
    }


    public Cliente(String nombre, String apellidos, Domicilio domicilio, int edad, Date fechaNacimiento, String curp) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.curp = curp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", curp=" + curp + '}';
    }
    
    
}
