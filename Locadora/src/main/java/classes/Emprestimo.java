/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Statege.Dinheiro;
import Statege.Pagamento;
import java.text.ParseException;

/**
 *
 * @author gabriel
 */
public class Emprestimo {
    private int id;
    
    private String Data;
    
    private String dataPrevista;
    
    private Cliente cliente;
    
    private Midia midia;
    
    private Reserva reserva;
    
    
    public Emprestimo(){
        
    }

    public Emprestimo(int id, String Data, String dataPrevista, Cliente cliente, Midia midia) {
        this.id = id;
        this.Data = Data;
        this.dataPrevista = dataPrevista;
        this.cliente = cliente;
        this.midia = midia;
        
    }
    
    public Emprestimo(int id, String Data, String dataPrevista, Reserva r) {
        this.id = id;
        this.Data = Data;
        this.dataPrevista = dataPrevista;
        this.cliente = r.getCliente();
        this.midia = r.getMidia();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return Data;
    }



    public void setData(String Data) {
        this.Data = Data;
    }

    public String getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }


   
    public void emprestar() throws ParseException {
        
        midia.emprestar(cliente);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
