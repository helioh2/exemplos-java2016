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
        private int numConta;
    
    private static int quantContas = 1;
    

    public ContaCorrente(String nomeCliente, String cpf) {
        this.saldo = 0.0;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.numConta = quantContas;
        quantContas++;
    }
    
    /**
     * Se a quantia passada é maior ou igual a 0,
     * adiciona a quantia ao saldo.
     * @param quantia
     * @return true se deposito foi bem sucedido, e false caso contrário.
     */
    public boolean depositar(Double quantia) {
        if (quantia >= 0){
            saldo += quantia;
            return true;
        } else {
            return false;
        }
    }

    public Double getSaldo() {
        return saldo;
    }
    
    
    public int getNumConta() {
        return numConta;
    }
    
    public boolean sacar(Double quantia){
        if (quantia <= saldo){
            saldo -= quantia;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir(ContaCorrente outraConta,
            Double quantia) {
        if (this.sacar(quantia)){
            outraConta.depositar(quantia);
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    
    
    
}
