package estados;

/**
 * *********************************************************************
 * Module: Reservado.java Author: gabriel Purpose: Defines the Class Reservado
 * *********************************************************************
 */
import classes.Cliente;
import classes.Midia;

/**
 * @pdOid 18cd4ccd-333d-4110-b85b-47b69e4ee60e
 */
public class Reservado implements Estado {

    Midia midia;

    public Reservado(Midia midia) {
        this.midia = midia;

    }

    /**
     * @pdOid 0036bc29-9e7a-4243-b341-fa891fb3fa1d
     */
    @Override
    public void emprestar(Cliente cliente) {
        System.out.println("emprestimo da midia"+ midia.getTituloTemp() +
                " realizado com sucesso pelo cliente "+ cliente.getNome());
        midia.setEstado(midia.getEmprestado());
    }

    /**
     * @pdOid ce75a146-311a-43b8-9520-0d664a27e356
     */
    @Override
    public void devolver(Cliente cliente) {
        System.out.println("ERRO: impossivel devolver mídia ja reservada");
    }

    /**
     * @pdOid fb1ea75a-0a4e-44e7-9575-d8cd4ed8bc4e
     */
    public void cancelar(Cliente cliente) {
        System.out.println("Reserva cancelada com sucesso");
        midia.setEstado(midia.getDisponivel());
       
    }
    

    @Override
    public void reservar(Cliente cliente) {
        System.out.println("ERRO: a midia " + midia.getTituloTemp() + "nao pode ser"
                + " reservada para o cliente " + cliente.getNome() + " pois ja esta"
                + "reservada");
        midia.setEstado(midia.getReservado());
    }

}
