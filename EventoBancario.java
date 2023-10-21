/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancousuario;
import java.util.Date;

/**
 *
 * @author luciana
 */
public class EventoBancario {
    private Date fecha;
    private String tituloEvento;
    private String descripcionEvento;
    private Cliente cliente;

    public EventoBancario(Date fecha, String tituloEvento, String descripcionEvento) {
        this.fecha = fecha;
        this.tituloEvento = tituloEvento;
        this.descripcionEvento = descripcionEvento;
    }

    // Métodos
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "EventoBancario [fecha=" + fecha + ", tituloEvento=" + tituloEvento + ", descripcionEvento=" + descripcionEvento + "]";
    }
}
