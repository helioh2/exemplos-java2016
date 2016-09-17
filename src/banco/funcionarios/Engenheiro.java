/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.funcionarios;

import figuras.Figura;

/**
 *
 * @author Lenovo
 */
public class Engenheiro extends Funcionario implements Cloneable {
    
    public Engenheiro(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double getBonificacao() {
        return salario*0.15;
    }

    
   
    
    
}
