/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Statege;

import classes.Devolucao;

/**
 *
 * @author gabriel
 */
public class Dinheiro implements Pagamento{

    Devolucao devolucao;
    public Dinheiro(Devolucao devolucao) {
        this.devolucao = devolucao;
    }
    
    @Override
    public void pagar() {
        System.out.println("O pagamento da midia foi realizado com sucesso "
                + "usando dinheiro");
    }
    
}
