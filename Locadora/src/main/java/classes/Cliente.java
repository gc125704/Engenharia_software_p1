package classes;


import java.util.Date;

/** @pdOid 0065d616-5124-44ee-9e3b-997102fefce4 */
public class Cliente {
   /** @pdOid 86cd038f-a0b8-4f84-9232-c3089ac37bca */
   private int id;
   /** @pdOid a810f9a1-1b85-4a82-8ffa-1aba4400cf2d */
   private String nome;
   /** @pdOid e3037fca-15a9-4d04-b05e-d05aaffb2b8b */
   private String cpf;
   /** @pdOid 87b7b7e9-1e72-463c-a7f9-59c86517e569 */
   private String dataNascimento;
   
   /** @pdOid d6167d39-b57f-4978-8801-3185f642120e */
   public void cadastrar(Cliente c) {
   System.out.println("usuario "+c.nome+" Cadastrado com sucesso");
   }
   
   /** @pdOid cee2ae01-c3c9-4b0b-850b-70d61b708bd1 */
   public void alterar() {
   System.out.println(" usuario alterado com sucesso");
   }
   
   /** @pdOid 996e115c-20fa-44e7-9a92-e24a4f215e2d */
   public void excluir() {
   System.out.println("usuario excluido com sucesso");
   }

    public Cliente(int id, String nome, String cpf, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
     public Cliente(Cliente cli) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    
     
     
    
    public void mostrarCliente(Cliente cli){
    }

    public void MostraCliente(Cliente c) {
        System.out.println("nome: " + this.nome);
        
    }
    
        
        

   
}