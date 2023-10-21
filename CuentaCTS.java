/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancousuario;

/**
 *
 * @author Oscar
 */
public class CuentaCTS extends CuentaBancaria {
    private double tasaInteresAnual = 0.07;  // 7%
    private double puntos;

    public CuentaCTS(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado, double puntos) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, estado);
        this.tasaInteresAnual = 0.07;
        this.puntos = puntos;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "CuentaCTS: " + super.toString() + ", Tasa de Interés Anual: " + tasaInteresAnual + ", Puntos: " + puntos;
    }
}
