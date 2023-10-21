/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancousuario;

/**
 *
 * @author Oscar
 */
public class CuentaCorriente extends CuentaBancaria {
    private double tasaInteresAnual = 0.02;  // 2%
    private int maxRetiro;

    public CuentaCorriente(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado, int maxRetiro) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, estado);
        this.tasaInteresAnual = 0.02;
        this.maxRetiro = maxRetiro;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

    @Override
    public String toString() {
        return "CuentaCorriente: " + super.toString() + ", Tasa de Interés Anual: " + tasaInteresAnual + ", Máximo de Retiro: " + maxRetiro;
    }
}
