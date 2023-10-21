/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancousuario;

import java.util.Date;

/**
 *
 * @author carlo
 */
public class BancoUsuario {

   public static void main(String[] args) {
        String[] beneficiosSueldo = {"ropa", "restaurante", "gym", "conciertos", "vuelos", "hotel"};
        String[] beneficiosFree = {"teatro", "restaurante", "cursos"};
        CuentaBancaria cuenta = new CuentaBancaria("123456", "Cuenta Bancaria", "1234-5678-9012", "Activa");
        //for (int i = 1; i <= 10; i++) {
           // MovimientoCuenta movimiento = new MovimientoCuenta("Operación" + i, "Descripción" + i, new Date(), 100.0 * i, "Tipo" + i);
            //cuenta.getMovimientos().add(movimiento);
       // }
        //cuenta.ordenarMovimientosPorFechaAscendente();
        CuentaFree cuentaFree = new CuentaFree("123456", "Cuenta Free", "1234-5678-9012", "Activa", 0.05, beneficiosFree, true);
        CuentaSueldo cuentaSueldo = new CuentaSueldo("123456", "Cuenta Sueldo", "1234-5678-9012", "Activa", 0.05, beneficiosSueldo, "Mi Empresa");
        CuentaCTS cuentaCTS = new CuentaCTS("123456789", "Cuenta CTS del Cliente", "987654321", "Activa", 50000);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("987654321", "Cuenta Corriente del Cliente", "123456789", "Activa", 5);
        Cliente cliente = new Cliente("ID123", "Nombre", "Apellido", "Dirección", 123456789, 1234567890);
        CuentaAhorro ahorro1 = new CuentaAhorro("A001", "Cuenta de Ahorro 1", "CCI001", "Activa", 0.03, new String[]{"Beneficio1", "Beneficio2"});
        CuentaAhorro ahorro2 = new CuentaAhorro("A002", "Cuenta de Ahorro 2", "CCI002", "Activa", 0.03, new String[]{"Beneficio3", "Beneficio4"});
        CuentaCorriente corriente1 = new CuentaCorriente("C001", "Cuenta Corriente 1", "CCI003", "Activa", 1000);
        CuentaCorriente corriente2 = new CuentaCorriente("C002", "Cuenta Corriente 2", "CCI004", "Activa", 1500);
        CuentaCTS cts1 = new CuentaCTS("CTS001", "Cuenta CTS", "CCI005", "Activa", 5000);
     
        cliente.agregarCuenta(ahorro1);
        cliente.agregarCuenta(ahorro2);
        cliente.agregarCuenta(corriente1);
        cliente.agregarCuenta(corriente2);
        cliente.agregarCuenta(cts1);
        
        System.out.println(cuenta.toString());
        System.out.println(cuentaFree.toString());
        System.out.println(cuentaCTS);
        System.out.println(cuentaCorriente);
        System.out.println("Tasa de Interés Anual: " + cuentaCorriente.getTasaInteresAnual());
        System.out.println("Máximo de Retiro en Cajero: " + cuentaCorriente.getMaxRetiro());
        System.out.println(cuentaSueldo.toString());
        System.out.println(cliente.toString());
        for (CuentaBancaria CuentaBancariaCliente : cliente.getCuentas()) {
            System.out.println(CuentaBancariaCliente.toString());
    }
}
}
