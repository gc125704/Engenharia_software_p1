/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication;

import classes.Cliente;
import classes.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class app {

    public static void menu() {
        System.out.println("+++++++MENU++++++++");
        System.out.println("1-cadastrar cliente");
        System.out.println("2-cadastrar midia");
        System.out.println("3-reservar midia");
        System.out.println("4-cancelar reserva");
        System.out.println("5-devolver midia");
        System.out.println("6-devolver midia danificada");
        System.out.println("7-excluir cliente");
        System.out.println("8-excluir midia");
        System.out.println("9-emprestar midia");
        System.out.println("0-sair");
        System.out.println("--------------------");
        System.out.println("digite uma opcao");
    }

    public static void mostrarTitulosCadastrados(ArrayList<Titulo> titulos) {

        System.out.println("+titulos diponiveis para midias+");
        Titulo titulo = new Titulo();
        for (int i = 0; i < titulos.size(); i++) {
            titulo = titulos.get(i);
            System.out.println(i + "-nome: " + titulo.getDescricao());
        }
        System.out.println("------------------------------");
    }

    public Date pegaData(String temp) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(temp);

        return data;
    }

    public static void mostrarMidias(ArrayList<Midia> midias) {
        System.out.println("+Midias cadastradas no sistema+");
        if (midias.size() > 0) {
            for (int i = 0; i < midias.size(); i++) {
                System.out.println(i
                        + "-nome: " + midias.get(i).getTituloTemp()
                        + " id:" + midias.get(i).getId());
            }
        } else {
            System.out.println("nao ha midias cadastradas no sistema");
        }
    }

    public static void mostrarClientes(ArrayList<Cliente> clientes) {
        System.out.println("+Clientes cadastradas no sistema+");
        if (clientes.size() > 0) {
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println(i + "-nome: " + clientes.get(i).getNome());
            }
        } else {
            System.out.println("nao ha clientes cadastrados no sistema");
        }
    }

    public static int achaReserva(ArrayList<Reserva> reservas, Midia midia) {
        int flag = 0;
        int cont = 0;
        while (cont < reservas.size() && flag == 0) {
            if (reservas.get(cont).getMidia() == midia) {
                flag = 1;
            }
            cont++;

        }
        return flag;
    }

    public static void main(String[] args) throws ParseException {

        int opcao = 999;
        int id = 0; //midia
        int idCliente = 0;
        int idReserva = 0;
        int idEmprestimo = 0;
        int idDevolucao = 0;
        Date data;

        int tempInt, tempInt2, tempInt3;

        Scanner scan = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Titulo> titulos = new ArrayList<>();
        ArrayList<Midia> midias = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();

        Cliente cli = new Cliente(1, "Robson", "123456", "23/11/2015");
        Emprestimo emprestimo = new Emprestimo();

        cli.cadastrar(cli);

        clientes.add(cli);

        System.out.println("--------------");

        Titulo titulo = new Titulo("titulo1");
        titulos.add(titulo);
        Titulo titulo2 = new Titulo("titulo2");
        titulos.add(titulo2);
        Titulo titulo3 = new Titulo("titulo3");
        titulos.add(titulo3);

        Midia m = new Midia(0, titulo);
        midias.add(m);
        id++;

        while (opcao != 0) {
            menu();
            opcao = scan.nextInt();
            switch (opcao) {

                case 0:
                    break;
                case 1:
                    Scanner s = new Scanner(System.in);
                    System.out.println("digite o nome");
                    String tempString = s.nextLine();
                    System.out.println("digite o CPF");
                    String CPF = s.nextLine();
                    System.out.println("digite a data de nascimento");
                    String temp = s.nextLine();
                    Cliente clienteTemp = new Cliente(idCliente, tempString,
                            CPF, temp);
                    clientes.add(clienteTemp);
                    idCliente++;
                    break;
                case 2:
                    mostrarTitulosCadastrados(titulos);
                    System.out.println("digite o numero do titulo para"
                            + " cadastrar na midia");
                    tempInt = scan.nextInt();
                    Titulo tituloTemp = titulos.get(tempInt);
                    Midia midia = new Midia(id, tituloTemp);
                    midia.cadastrar();
                    midias.add(midia);
                    id++;
                    break;
                case 3:
                    mostrarMidias(midias);
                    System.out.println("digite o numero da midia que voce"
                            + "deseja reservar");
                    tempInt = scan.nextInt();
                    mostrarClientes(clientes);
                    System.out.println("digite o numero referente ao cliente"
                            + "que ira fazer a reserva");
                    tempInt2 = scan.nextInt();
                    midias.get(tempInt).reservar(clientes.get(tempInt2));
                    Reserva reserva = new Reserva("28/06/2022",
                            clientes.get(tempInt2), midias.get(tempInt));
                    reservas.add(reserva);
                    break;
                case 4:
                    System.out.println("escolha o numero da midia cuja reserva "
                            + "sera cancelada");
                    mostrarMidias(midias);
                    tempInt = scan.nextInt();
                    midias.get(tempInt).cancelar(cli);
                    break;
                case 5:
                    System.out.println("escolha o numero da midia que voce "
                            + "deseja fazer a devolucao");
                    mostrarMidias(midias);
                    tempInt = scan.nextInt();
                    System.out.println("escolha o cliente que ira fazer a "
                            + "devolucao");
                    mostrarClientes(clientes);
                    tempInt2 = scan.nextInt();
                    midias.get(tempInt).devolver(clientes.get(tempInt2));
                    System.out.println("escolha o metodo de pagamento: 1 para "
                            + " dinheiro e 2 para cartao de credito");
                    tempInt = scan.nextInt();
                    Devolucao devolucao = new Devolucao("28/06/2022", emprestimo);
                    if (tempInt == 1) {

                        devolucao.setPagamento(devolucao.getDinheiro());

                    } else {
                        devolucao.setPagamento(devolucao.getCartaoCredito());
                    }
                    devolucao.pagar();
                    //emprestimo.pagar();
                    break;
                case 6:
                    System.out.println("escolha o numero da midia que voce "
                            + "deseja fazer a devolucao");
                    mostrarMidias(midias);
                    tempInt = scan.nextInt();
                    System.out.println("escolha o cliente que ira fazer a "
                            + "devolucao");
                    mostrarClientes(clientes);
                    tempInt2 = scan.nextInt();
                    if (midias.get(tempInt).getEstado() == midias.get(tempInt).getEmprestado()) {
                        midias.get(tempInt).setEstado(midias.get(tempInt).getDanificado());
                        midias.get(tempInt).devolver(clientes.get(tempInt2));
                    } else {
                        midias.get(tempInt).devolver(clientes.get(tempInt2));
                    }
                    break;
                case 7:
                    System.out.println("escolha o numero do cliente que sera "
                            + "removido");
                    mostrarClientes(clientes);
                    tempInt = scan.nextInt();
                    clientes.remove(tempInt);
                    mostrarClientes(clientes);
                    break;
                case 8:
                    System.out.println("escolha o numero da midia que sera "
                            + "removida");
                    mostrarMidias(midias);
                    tempInt = scan.nextInt();
                    midias.remove(tempInt);
                    mostrarMidias(midias);
                    break;
                case 9:

                    System.out.println("selecione a midia que voce deseja "
                            + "realizar um emprestimo");
                    mostrarMidias(midias);
                    tempInt = scan.nextInt();
                    tempInt2 = achaReserva(reservas, midias.get(tempInt));
                    if (tempInt2 == 1) {
                        emprestimo = new Emprestimo(idEmprestimo,
                                "29/06/2022", "06/07/2022", reservas.get(tempInt));

                    } else {
                        System.out.println("escolha o numero do cliente que fara "
                                + "o emprestimo");
                        mostrarClientes(clientes);
                        tempInt2 = scan.nextInt();
                        emprestimo = new Emprestimo(idEmprestimo,
                                "29/06/2022", "06/07/2022",
                                clientes.get(tempInt2), midias.get(tempInt));
                    }
                    idEmprestimo++;
                    midias.get(tempInt).emprestar(cli);
                    break;
            }
        }

    }
}
