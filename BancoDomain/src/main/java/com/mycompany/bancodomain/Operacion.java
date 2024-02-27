/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodomain;

/**
 *
 * @author luisp
 */
public class Operacion {
    protected long id;
    protected Cuenta cuentaEmisora;
    protected Cliente clienteEmisor;
    protected final TIPO_OPERACION tipoOperacion = null;
    protected float monto;

    public Operacion() {
    }

    public Operacion(long id, Cuenta cuentaEmisora, Cliente clienteEmisor, float monto) {
        this.id = id;
        this.cuentaEmisora = cuentaEmisora;
        this.clienteEmisor = clienteEmisor;
        this.monto = monto;
    }

    public Operacion(Cuenta cuentaEmisora, Cliente clienteEmisor, float monto) {
        this.cuentaEmisora = cuentaEmisora;
        this.clienteEmisor = clienteEmisor;
        this.monto = monto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cuenta getCuentaEmisora() {
        return cuentaEmisora;
    }

    public void setCuentaEmisora(Cuenta cuentaEmisora) {
        this.cuentaEmisora = cuentaEmisora;
    }

    public Cliente getClienteEmisor() {
        return clienteEmisor;
    }

    public void setClienteEmisor(Cliente clienteEmisor) {
        this.clienteEmisor = clienteEmisor;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Operacion{" + "id=" + id + ", cuentaEmisora=" + cuentaEmisora + ", clienteEmisor=" + clienteEmisor + ", tipoOperacion=" + tipoOperacion + ", monto=" + monto + '}';
    }
    
}
