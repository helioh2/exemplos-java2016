/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.funcionarios;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ControleBonificacoes {
    
    private double totalBonificacoes = 0;
    
    public void addBonificacao(Funcionario funcionario){
        totalBonificacoes += funcionario.getBonificacao();
    }
    
    public void addBonificacao(List<Funcionario> funcionarios) {
        for (Funcionario f : funcionarios){
            addBonificacao(f);
        }
    }

    public double getTotalBonificacoes() {
        return totalBonificacoes;
    }
    
    
    
}
