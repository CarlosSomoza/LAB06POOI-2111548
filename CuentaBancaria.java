/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancousuario;

/**
 *
 * @author carlo
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private String descripcionCuenta;
    private String cuentaCCI;
    private double saldoDisponible;
    private ArrayList<MovimientoCuenta> movimientos;
    private String estado;

    public CuentaBancaria(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.descripcionCuenta = descripcionCuenta;
        this.cuentaCCI = cuentaCCI;
        this.saldoDisponible = 0;
        this.movimientos = new ArrayList<MovimientoCuenta>();
        this.estado = estado;
    }

    public void calcularInteresMensual() {
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    public String getCuentaCCI() {
        return cuentaCCI;
    }

    public void setCuentaCCI(String cuentaCCI) {
        this.cuentaCCI = cuentaCCI;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public ArrayList<MovimientoCuenta> getMovimientos() {
        return movimientos;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Numero de Cuenta: " + numeroCuenta + ", Descripción: " + descripcionCuenta + ", CCI: " + cuentaCCI + ", Saldo Disponible: " + saldoDisponible + ", Estado: " + estado + "]";
    }
}
