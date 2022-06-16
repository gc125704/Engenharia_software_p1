/***********************************************************************
 * Module:  Reservado.java
 * Author:  gabriel
 * Purpose: Defines the Class Reservado
 ***********************************************************************/

import java.util.*;

/** @pdOid 18cd4ccd-333d-4110-b85b-47b69e4ee60e */
public class Reservado implements Estado {
   /** @pdOid 0036bc29-9e7a-4243-b341-fa891fb3fa1d */
   public void emprestar() {
   System.out.println("Impossivel emprestar, mídia ja reservada");
   }
   
   /** @pdOid 45302891-6bba-4703-8e0e-d99a4bd333d2 */
   public void reservar() {
   System.out.println("Impossivel reservar, mídia já reservada");
   }
   
   /** @pdOid ce75a146-311a-43b8-9520-0d664a27e356 */
   public void devolver() {
   System.out.println("Impossivel reservar, mídia ja reservada");
   }
   
   /** @pdOid fb1ea75a-0a4e-44e7-9575-d8cd4ed8bc4e */
   public void cancelar() {
   System.out.println("Reserva cancelada com sucesso");
   }

}