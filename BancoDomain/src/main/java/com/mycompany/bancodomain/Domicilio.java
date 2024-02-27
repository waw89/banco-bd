/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodomain;

/**
 *
 * @author luisp
 */
public class Domicilio {
    
    private long id;
    private String calle;
    private String entreCalles;
    private int zipCode;
    private String colonia;
    private String referencia;

    public Domicilio() {
    }
    
    public Domicilio(long id, String calle, String entreCalles, int zipCode, String colonia, String referencia) {
        this.id = id;
        this.calle = calle;
        this.entreCalles = entreCalles;
        this.zipCode = zipCode;
        this.colonia = colonia;
        this.referencia = referencia;
    }

    public Domicilio(String calle, String entreCalles, int zipCode, String colonia, String referencia) {
        this.calle = calle;
        this.entreCalles = entreCalles;
        this.zipCode = zipCode;
        this.colonia = colonia;
        this.referencia = referencia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getEntreCalles() {
        return entreCalles;
    }

    public void setEntreCalles(String entreCalles) {
        this.entreCalles = entreCalles;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "id=" + id + ", calle=" + calle + ", entreCalles=" + entreCalles + ", zipCode=" + zipCode + ", colonia=" + colonia + ", referencia=" + referencia + '}';
    }
    
    
}
