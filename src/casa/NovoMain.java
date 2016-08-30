/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class NovoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comodo c1 = new Comodo();
        c1.setLampada(new Lampada());
        List<Movel> moveis = new ArrayList<Movel>();
        moveis.add(new Movel());
        moveis.add(new Movel());
        Movel m3 = new Movel();
        Movel m4 = m3;
        moveis.add(m3);
        moveis.add(m4);
        System.out.println(moveis);
        //
        Set aux = new HashSet();
        aux.addAll(moveis);
        moveis = new ArrayList();
        moveis.addAll(aux);
        
        //Collections.sort(moveis);
        
        System.out.println(moveis);
        
        Pessoa p1 = new Pessoa("fulano", c1);
        c1.iluminar();
        
        System.out.println(c1.getPessoas());
        
    }
    
}
