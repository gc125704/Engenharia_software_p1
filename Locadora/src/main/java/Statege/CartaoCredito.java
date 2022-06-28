/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Statege;

/**
 *
 * @author gabriel
 */
public class CartaoCredito implements Pagamento{

    private String numero;
    
    public CartaoCredito() {
    }

    @Override
    public void pagar() {
       System.out.println("O pagamento da midia foi realizado com sucesso "
                + "usando dinheiro");
    }   
    
    
}
