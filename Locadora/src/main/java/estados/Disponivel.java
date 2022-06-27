package estados;

import classes.Cliente;
import classes.Midia;

/**
 * @pdOid a2921e06-a68a-4067-ad0f-590fc30c1d97
 */
public class Disponivel implements Estado {
    
    Midia midia;
    Cliente cliente;
    
    public Disponivel(Midia midia) {
        this.midia = midia;
        
    }
    
    

    @Override
    public void reservar(Cliente cliente) {
        System.out.println("a midia " + midia.getTituloTemp() + " foi reservada pelo cliente:");
        cliente.MostraCliente(cliente);
        midia.setEstado(midia.getReservado());
        
       
    }

    /**
     * @pdOid 9a0401fe-57c4-4cde-b9e1-84949c50a4ac
     */
    @Override
    public void emprestar(Cliente cliente) {

    }
    @Override
    public void devolver(Cliente cliente) {
        System.out.println(" Mídia devolvida com sucesso ");
    }

}
