/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancousuario;
import java.util.Arrays;

/**
 *
 * @author Oscar
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteresAnual = 0.03;  // 3%
    private String[] beneficios;

    public CuentaAhorro(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado, double tasaInteresAnual, String[] beneficios) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, estado);
        this.tasaInteresAnual = tasaInteresAnual;
        this.beneficios = beneficios;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public String[] getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "CuentaAhorro: " + super.toString() + ", Tasa de Interés Anual: " + tasaInteresAnual + ", Beneficios: " + Arrays.toString(beneficios);
    }
}

