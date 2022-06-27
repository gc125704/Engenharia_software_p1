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

    public Date pegaData(String temp) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(temp);

        return data;
    }

    public static void main(String[] args) throws ParseException {

        try {

            int opcao = 0;
            int id = 0;
            Date data;

            Scanner scan = new Scanner(System.in);

            ArrayList<Cliente> clientes = new ArrayList<>();

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            data = formato.parse("23/11/2015");

            Cliente cli = new Cliente(1, "Robson", "123456", data);

            cli.cadastrar(cli);

            clientes.add(cli);

            System.out.println("--------------");

            Titulo titulo = new Titulo("titulo1");

            Midia m = new Midia(0, titulo);
            id++;

            //m.reservar(clientes.get(0), m);
            //m.reservar(cli, m);
            while (opcao != 7) {
                menu();
                opcao = scan.nextInt();
                switch (opcao) {

                    case 1:
                        System.out.println("digite o nome");
                        String tempString = scan.nextLine();
                        System.out.println("digite o CPF");
                        String CPF = scan.nextLine();
                        System.out.println("digite a data de nascimento");
                        String temp = scan.nextLine();
                        //data = pegaData(temp);
                        break;

                }
            }
        } catch (Exception e) {
        }
    }

}
