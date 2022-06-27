package estados;

import classes.Cliente;
import classes.Midia;
import estados.Estado;

/** @pdOid a9292204-6fed-48ed-af52-77af376662e3 */
public class Danificado implements Estado {
   /** @pdOid 8ca14f65-682f-4e93-a06f-7d963e46e746 */
   public void emprestar() {
   System.out.println("Impossivel emprestar, mídia danificada");
   }
   
   
   /** @pdOid f51a097b-e3a0-406e-b420-5cfd94d785f2 */
   public void devolver() {
   System.out.println("Mídia devolvida com sucesso, uma multa será cobrada pelo dano a mídia");
   }

    @Override
    public void reservar(Cliente c, Midia m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}