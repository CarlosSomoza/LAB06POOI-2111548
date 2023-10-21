/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancousuario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author carlo
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int dni;
    private List<CuentaBancaria> cuentas;
    private List<EventoBancario> eventosBancarios;  // Cambio en la variable

    public Cliente(String idCliente, String nombre, String apellido, String direccion, int telefono, int dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.cuentas = new ArrayList<>();
        this.eventosBancarios = new ArrayList<>();  // Inicialización de la lista
    }

    // Métodos
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    } 
    
    public List<EventoBancario> getEventosBancarios() {
        return eventosBancarios;
    }

    public void agregarEventoBancario(EventoBancario evento) {
        if (eventosBancarios.size() < 5) {  // Verificación del límite de 5 eventos
            eventosBancarios.add(evento);
            evento.setCliente(this);  // Asociación bidireccional
        } else {
            System.out.println("El cliente ha alcanzado el límite de 5 eventos bancarios anuales.");
        }
    }

    @Override
public String toString() {
    return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", dni=" + dni + "]";
           //(cuentas.isEmpty() ? "" : ", Cuentas: " + cuentas.toString()) +
           //(eventoBancario == null ? "" : ", Evento Bancario: " + eventoBancario.toString());
}
}
