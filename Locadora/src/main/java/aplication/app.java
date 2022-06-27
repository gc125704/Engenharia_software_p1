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
import javax.xml.crypto.Data;

/**
 *
 * @author gabriel
 */
public class app {

    public static void menu() {
        System.out.println("+MENU+");
        System.out.println("1-cadastrar cliente");
        System.out.println("2-cadastrar midia");
        System.out.println("3-reservar midia");
        System.out.println("4-devolver midia");
        System.out.println("5-excluir cliente");
        System.out.println("6-excluir midia");
        System.out.println("7-sair");
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

    public static void main(String[] args) throws ParseException {

        int opcao = 0;
        int id = 0;
        int idCliente = 0;
        Date data;

        Scanner scan = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Titulo> titulos = new ArrayList<>();
        ArrayList<Midia> midias = new ArrayList<>();

//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        data = formato.parse("23/11/2015");
        Cliente cli = new Cliente(1, "Robson", "123456", "23/11/2015");

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
        id++;

        //m.reservar(cli);
        //m.devolver(cli);
        while (opcao != 7) {
            menu();
            opcao = scan.nextInt();
            switch (opcao) {

                case 1:
                    Scanner s = new Scanner(System.in);
                    System.out.println("digite o nome");
                    String tempString = s.nextLine();
                    System.out.println("digite o CPF");
                    String CPF = s.nextLine();
                    System.out.println("digite a data de nascimento");
                    String temp = s.nextLine();
                    Cliente clienteTemp = new Cliente(idCliente,tempString,
                            CPF,temp);
                    clientes.add(clienteTemp);
                    idCliente++;
                    break;
                case 2:
                    mostrarTitulosCadastrados(titulos);
                    System.out.println("digite o numero do titulo para"
                            + " cadastrar na midia");
                    int tempInt = scan.nextInt();
                    Titulo tituloTemp = titulos.get(tempInt);
                    Midia midia = new Midia(id, tituloTemp);
                    midia.cadastrar();
                    midias.add(midia);
                    id++;
                    break;
                case 3:
                    break;

            }
        }

    }
}
