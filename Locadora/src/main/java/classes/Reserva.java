/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Statege.CartaoCredito;
import Statege.Pagamento;

/**
 *
 * @author gabriel
 */
public class Reserva {

    private String dataReserva;

    private Cliente cliente;

    private Midia midia;

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva(String dataReserva, Cliente cliente, Midia midia) {
        this.dataReserva = dataReserva;
        this.cliente = cliente;
        this.midia = midia;
    }

}
