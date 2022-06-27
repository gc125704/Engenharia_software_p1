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

/**
 *
 * @author gabriel
 */
public class app {

    public static void main(String[] args) throws ParseException {

        try {

            ArrayList<Cliente> clientes = new ArrayList<>();

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse("23/11/2015");

            Cliente cli = new Cliente(1, "Robson", "123456", data);

            cli.cadastrar(cli);

            clientes.add(cli);

            System.out.println("--------------");

            Titulo titulo = new Titulo("titulo1");

            Midia m = new Midia(0, titulo);

            m.reservar(cli, m);
            m.reservar(cli, m);
        } catch (Exception e) {
        }
    }

}
