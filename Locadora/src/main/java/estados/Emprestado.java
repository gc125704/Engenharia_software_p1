package estados;

import classes.Cliente;
import classes.Midia;
import estados.Estado;

/** @pdOid 4b2388e9-77bc-4dd2-88ae-d891554d38ca */
public class Emprestado implements Estado {
   /** @pdOid e20f8e3a-cdc1-41b3-acd7-ac4698eced15 */
   public void emprestar() {
   System.out.println("Impossivel emprestar, mídia ja esta emprestada");
   }
   
   
   /** @pdOid b0609e35-9ab9-44bf-a970-434dfc849ce3 */
   public void devolver() {
   System.out.println("Mídia devolvida com sucesso");
   }

    @Override
    public void reservar(Cliente c, Midia m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}