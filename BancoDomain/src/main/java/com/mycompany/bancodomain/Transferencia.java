/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodomain;

/**
 *
 * @author luisp
 */
public class Transferencia extends Operacion {
    
    private Cuenta cuentaBeneficiaria;
    private Cliente clienteBeneficiario;

    public Transferencia(Cuenta cuentaBeneficiaria, Cliente clienteBeneficiario) {
        this.cuentaBeneficiaria = cuentaBeneficiaria;
        this.clienteBeneficiario = clienteBeneficiario;
    }

    public Transferencia(Cuenta cuentaBeneficiaria, Cliente clienteBeneficiario, long id, Cuenta cuentaEmisora, Cliente clienteEmisor, float monto) {
        super(id, cuentaEmisora, clienteEmisor, monto);
        this.cuentaBeneficiaria = cuentaBeneficiaria;
        this.clienteBeneficiario = clienteBeneficiario;
    }

    public Transferencia(Cuenta cuentaBeneficiaria, Cliente clienteBeneficiario, Cuenta cuentaEmisora, Cliente clienteEmisor, float monto) {
        super(cuentaEmisora, clienteEmisor, monto);
        this.cuentaBeneficiaria = cuentaBeneficiaria;
        this.clienteBeneficiario = clienteBeneficiario;
    }

    public Cuenta getCuentaBeneficiaria() {
        return cuentaBeneficiaria;
    }

    public void setCuentaBeneficiaria(Cuenta cuentaBeneficiaria) {
        this.cuentaBeneficiaria = cuentaBeneficiaria;
    }

    public Cliente getClienteBeneficiario() {
        return clienteBeneficiario;
    }

    public void setClienteBeneficiario(Cliente clienteBeneficiario) {
        this.clienteBeneficiario = clienteBeneficiario;
    }

    @Override
    public String toString() {
        return "Transferencia{" + "cuentaBeneficiaria=" + cuentaBeneficiaria + ", clienteBeneficiario=" + clienteBeneficiario + '}';
    }
    
    
    
}
