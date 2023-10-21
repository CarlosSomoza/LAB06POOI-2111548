/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancousuario;

/**
 *
 * @author Cristhian
 */
public class CuentaSueldo extends CuentaAhorro {
    private String nombreEmpresa;

    public CuentaSueldo(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado, double tasaInteresAnual, String[] beneficios, String nombreEmpresa) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, estado, tasaInteresAnual, beneficios);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        String beneficiosStr = String.join(", ", this.getBeneficios());
        return "CuentaSueldo [nombreEmpresa=" + nombreEmpresa + ", beneficios=" + beneficiosStr + ", " + super.toString() + "]";
    }
}    

