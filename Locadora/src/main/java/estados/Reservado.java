package estados;

/***********************************************************************
 * Module:  Reservado.java
 * Author:  gabriel
 * Purpose: Defines the Class Reservado
 ***********************************************************************/

import classes.Cliente;
import classes.Midia;
import estados.Estado;
import java.util.*;

/** @pdOid 18cd4ccd-333d-4110-b85b-47b69e4ee60e */
public class Reservado implements Estado {
   /** @pdOid 0036bc29-9e7a-4243-b341-fa891fb3fa1d */
   public void emprestar() {
   System.out.println("Impossivel emprestar, mídia ja reservada");
   }
   
   /** @pdOid ce75a146-311a-43b8-9520-0d664a27e356 */
   public void devolver() {
   System.out.println("Impossivel reservar, mídia ja reservada");
   }
   
   /** @pdOid fb1ea75a-0a4e-44e7-9575-d8cd4ed8bc4e */
   public void cancelar() {
   System.out.println("Reserva cancelada com sucesso");
   }

    @Override
    public void reservar(Cliente c, Midia m) {
        System.out.println("a midia " + m.getTituloTemp() + "nao pode ser"
                + " emprestada para o cliente " + c.getNome() + " pois ja esta"
                        + "reservada");
    }

}