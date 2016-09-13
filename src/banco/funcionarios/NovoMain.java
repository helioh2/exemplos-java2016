/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.funcionarios;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class NovoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario f1 = new Engenheiro("fulano", "2828282");
        Gerente g1 = new Gerente("beltrano", "1272372828");
        
        f1.setSalario(1500);
        System.out.println(f1.getBonificacao());
        
        g1.setSalario(4000);
        System.out.println(g1.getBonificacao());
        
        Funcionario f2 = g1;
        System.out.println(f2.getBonificacao());
        
        ControleBonificacoes cb = new ControleBonificacoes();
        System.out.println(cb.getTotalBonificacoes());
        
        cb.addBonificacao(Arrays.asList(f1, g1));
        
        System.out.println(cb.getTotalBonificacoes());
        
        Caixa cx1 = new Caixa("zé ruela", "2763562782");
        
        cx1.setSalario(3000);
        System.out.println(cx1.getBonificacao());
        cb.addBonificacao(cx1);
         
        System.out.println(cb.getTotalBonificacoes());
    }
    
}
