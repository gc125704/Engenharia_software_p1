/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Statege.Pagamento;

/**
 *
 * @author gabriel
 */
public class Reserva {
    private String dataReserva;
    
    private Cliente cliente;
    
    private Pagamento p;
    
    public void pagar(){
        p.pagar();
    }
}
