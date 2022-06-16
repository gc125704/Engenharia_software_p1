/** @pdOid a2921e06-a68a-4067-ad0f-590fc30c1d97 */
public class Disponivel implements Estado {
   /** @pdOid 9a0401fe-57c4-4cde-b9e1-84949c50a4ac */
   public void emprestar() {
   System.out.println("Emprestado com sucesso");
   }
   
   /** @pdOid 2528074f-8d09-4a91-898c-262aabc7ad07 */
   public void reservar() {
   System.out.println("Mídia reservada com sucesso");
   }
   
   /** @pdOid 5120ed2a-8d9d-4d44-a285-71c9b7f8aa51 */
   public void devolver() {
   System.out.println(" Mídia devolvida com sucesso ");
   }

}