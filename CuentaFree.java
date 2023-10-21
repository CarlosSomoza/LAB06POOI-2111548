/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancousuario;

/**
 *
 * @author Cristhian
 */
public class CuentaFree extends CuentaAhorro {
    private boolean numIlimitadoRetiro;

    public CuentaFree(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado, double tasaInteresAnual, String[] beneficios, boolean numIlimitadoRetiro) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, estado, tasaInteresAnual, beneficios);
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    public boolean getNumIlimitadoRetiros() {
        return numIlimitadoRetiro;
    }

    public void setNumIlimitadoRetiro(boolean numIlimitadoRetiro) {
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    @Override
    public String toString() {
        return "CuentaFree [numIlimitadoRetiro=" + numIlimitadoRetiro + ", " + super.toString() + "]";
    }
}
