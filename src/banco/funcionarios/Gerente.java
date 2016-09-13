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
public class Gerente extends Funcionario {
    
    private String senha;
    private List<Funcionario> funcionarios;
    
    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }
    
    @Override
    public double getBonificacao() {
        return salario*0.1 + 1000;
    }
    
    
    
    
    
}
