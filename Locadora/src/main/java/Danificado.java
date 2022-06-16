/** @pdOid a9292204-6fed-48ed-af52-77af376662e3 */
public class Danificado implements Estado {
   /** @pdOid 8ca14f65-682f-4e93-a06f-7d963e46e746 */
   public void emprestar() {
   System.out.println("Impossivel emprestar, mídia danificada");
   }
   
   /** @pdOid 1dd11ce8-cbbf-448d-9bc1-86a1208fd171 */
   public void reservar() {
   System.out.println("impossivel reservar, mídia danificada");
   }
   
   /** @pdOid f51a097b-e3a0-406e-b420-5cfd94d785f2 */
   public void devolver() {
   System.out.println("Mídia devolvida com sucesso, uma multa será cobrada pelo dano a mídia");
   }

}