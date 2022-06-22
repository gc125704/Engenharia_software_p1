package classes;

/** @pdOid 4b2388e9-77bc-4dd2-88ae-d891554d38ca */
public class Emprestado implements Estado {
   /** @pdOid e20f8e3a-cdc1-41b3-acd7-ac4698eced15 */
   public void emprestar() {
   System.out.println("Impossivel emprestar, mídia ja esta emprestada");
   }
   
   /** @pdOid a578d5fc-51f1-451c-bd86-1c107742ea70 */
   public void reservar() {
   System.out.println("Impossivel reservar, mídia emprestada");
   }
   
   /** @pdOid b0609e35-9ab9-44bf-a970-434dfc849ce3 */
   public void devolver() {
   System.out.println("Mídia devolvida com sucesso");
   }

}