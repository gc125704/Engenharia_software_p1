/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Statege.Pagamento;

/**
 *
 * @author gabriel
 */
public class Reserva {
    private String dataReserva;
    
    private Cliente cliente;
    
    private Pagamento p;
    
    private Pagamento dinheiro;
    
    public void pagar(){
        p.pagar();
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

    public Pagamento getDinheiro() {
        return dinheiro;
    }

    public void setPagamento(Pagamento pagamento) {
        this.p = pagamento;
    }
    
    
    
    
}
