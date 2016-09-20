/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripulacao2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

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
        Agente ag1 = new Agente();
        ag1.setNome("fulano");
        System.out.println(ag1.getNome());
        
        Pessoa p1 = new Pessoa("beltrano", "rua pioneiro");
        
        Agente ag2 = new Agente(1, p1);
        
        Tripulacao t1 = new Tripulacao(1, p1);
    
        System.out.println(ag2.getNome());
        
        listaPessoas(Arrays.asList(ag1, t1));
        
        IPessoa pa1;
        pa1 = new Passageiro();
        
        Properties properties = new Properties();
        properties.setProperty("ev", "Escreveu errado");
        System.out.println(properties.getProperty("ev"));
        properties.put("ms", Calendar.getInstance()); //!!!
        
        System.out.println(properties.getProperty("ms"));
        
    }
    
    public static void listaPessoas(List<IPessoa> lp){
        for (IPessoa p: lp){
            System.out.println(p.getNome());
        }
    }
    
    
    
}
