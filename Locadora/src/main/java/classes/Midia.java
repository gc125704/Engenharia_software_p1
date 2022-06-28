package classes;

import estados.*;
import java.text.ParseException;

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

    public int getId() {
        return id;
    }

    private Estado emprestado;
    private Estado disponivel;
    private Estado reservado;
    private Estado danificado;
    private Estado estado;

    private Titulo titulo;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEmprestado() {
        return emprestado;
    }

    public Estado getDisponivel() {
        return disponivel;
    }

    public Estado getReservado() {
        return reservado;
    }

    public Estado getDanificado() {
        return danificado;
    }

    public void setReserva() {
        estado = reservado;
    }

    public String getTituloTemp() {
        return tituloTemp;
    }

    public void setTituloTemp(String tituloTemp) {
        this.tituloTemp = tituloTemp;
    }

    private String tituloTemp;

    public void cadastrar() {

        System.out.println("a midia " + this.tituloTemp + " foi cadastrada com "
                + "sucesso");
        System.out.println("------------------------------------");
    }

    public Midia(int id, Titulo titulo) {
        disponivel = new Disponivel(this);
        reservado = new Reservado(this);
        emprestado = new Emprestado(this);
        danificado = new Danificado(this);
        this.id = id;
        this.titulo = titulo;
        this.tituloTemp = titulo.descricao;
        estado = disponivel;
    }

//    public Midia(int id, Titulo titulo) {
//        super();
//        this.id = id;
//        this.titulo = titulo;
//        this.tituloTemp = titulo.descricao;
//
//    }
    public void reservar(Cliente c) {
        estado.reservar(c);
    }

    public void emprestar(Cliente c) throws ParseException {
     
        estado.emprestar(c);
    }

    public void devolver(Cliente c) {
        estado.devolver(c);
    }
    
    public void cancelar(Cliente c){
        estado.cancelar(c);
    }

}
