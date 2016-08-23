package banco.conta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class ContaCorrente {
    
    private Double saldo;
    private String nomeCliente;
    private String cpf;
    private Integer numConta;

    public ContaCorrente(String nomeCliente, String cpf) {
        this.saldo = 0.0;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }
    
    public boolean depositar(Double quantia) {
        if (quantia < 0){
            saldo += quantia;
            return true;
        } else {
            return false;
        }
    }

    public Double getSaldo() {
        return saldo;
    }
    
    
    
    
    
    
}
