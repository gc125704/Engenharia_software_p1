/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

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
    
    private Pagamento pagamento;

    public Emprestimo(int id, String Data, String dataPrevista, Cliente cliente, Midia midia, Pagamento pagamento) {
        this.id = id;
        this.Data = Data;
        this.dataPrevista = dataPrevista;
        this.cliente = cliente;
        this.midia = midia;
    }

   
    public void emprestar() throws ParseException {
        
        midia.emprestar(cliente);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
