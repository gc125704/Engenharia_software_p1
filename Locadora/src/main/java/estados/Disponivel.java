package estados;

import classes.Cliente;
import classes.Midia;

/**
 * @pdOid a2921e06-a68a-4067-ad0f-590fc30c1d97
 */
public class Disponivel implements Estado {

    @Override
    public void reservar(Cliente c, Midia m) {
        System.out.println("a midia " + m.getTituloTemp() + " foi reservada pelo cliente:");
        c.MostraCliente(c);
        m.setReserva();
    }

    /**
     * @pdOid 9a0401fe-57c4-4cde-b9e1-84949c50a4ac
     */
    public void emprestar() {

    }

    public void devolver() {
        System.out.println(" Mídia devolvida com sucesso ");
    }

}
