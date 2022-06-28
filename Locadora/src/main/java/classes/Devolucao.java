/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import Statege.*;

/**
 *
 * @author gabriel
 */
public class Devolucao {

    private String dataEfetiva;

    private Emprestimo emprestimo;

    private Pagamento pagamento;
    private Pagamento dinheiro;
    private Pagamento cartaoCredito;

    public String getDataEfetiva() {
        return dataEfetiva;
    }

    public void setDataEfetiva(String dataEfetiva) {
        this.dataEfetiva = dataEfetiva;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pagamento getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Pagamento dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Pagamento getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(Pagamento cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Devolucao(String dataEfetiva, Emprestimo emprestimo) {
        this.dataEfetiva = dataEfetiva;
        this.emprestimo = emprestimo;
        dinheiro = new Dinheiro(this);
        cartaoCredito = new CartaoCredito(this);
    }
}
