package classes;

/** @pdOid 29bf4e06-ebe4-44da-adff-033a6df565a3 */
public class Titulo {
   /** @pdOid 0487c368-7639-491c-991d-f911ef0b1884 */
   private int id;
   /** @pdOid 3f555b10-fc35-4826-96ef-ba4a89535e37 */
   public String descricao;
   
   /** system.out.println("dfajdfl");
    * 
    * 
    * @pdOid b07d48ea-20a7-4a9c-8c2a-7c68d8f54eb5 */
   
   public Titulo() {
        
   
   }
   
   public Titulo(String descricao) {
        this.descricao = descricao;
   
   }

    public void cadastrar() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
   /** @pdOid bbaa3d97-4989-477f-8435-5977142092de */
   public void alterar() {
   
   }
   
   /** @pdOid 49934d82-adf0-4a50-84aa-bd229239574d */
   public void excluir() {
   
   }

}