package classes;

import estados.Disponivel;
import estados.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class Midia {
    private int id;
    
    private Estado estado;
    private Estado emprestado;
    private Estado disponivel;
    private Estado reservado;
    private Estado danificado;
    
     private Titulo titulo;
   

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void setReserva(){
        estado = reservado;
    }

    public String getTituloTemp() {
        return tituloTemp;
    }

    public void setTituloTemp(String tituloTemp) {
        this.tituloTemp = tituloTemp;
    }
    
    private String tituloTemp;
    
    public void cadastrar(){
        
        System.out.println("");
    }

    public Midia(int id, Titulo titulo) {
        this.id = id;
        this.titulo = titulo;
        this.tituloTemp = titulo.descricao;
        estado = disponivel;
    }
    
    
    
    public void reservar(Cliente c, Midia m){
        estado.reservar(c, m);
    }
    
    public void emprestar(Cliente c, Midia m) throws ParseException{
        System.out.println("a midia " + m.tituloTemp + " foi emprestada pelo cliente:");
        c.MostraCliente(c);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date data = formato.parse("22/06/2022");
        Date dataPrevista = formato.parse("22/07/2022");
        
        Emprestimo emprestimo = new Emprestimo(0,data,dataPrevista,c,m);
        
        //this.estado = Reservado;
    }
    
}
