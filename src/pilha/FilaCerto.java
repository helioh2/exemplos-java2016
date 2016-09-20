/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.Vector;

/**
 *
 * @author Lenovo
 */
public class FilaCerto {
    
    private Vector lista; //composição

    public FilaCerto() {
        lista = new Vector();
    }
    
    
     public void adicionarNoFim(Object obj) {
        lista.add(obj);
    }
    
    public Object removeDoInicio(){
        return lista.remove(0);
    }

    @Override
    public String toString() {
        return lista.toString();
    }
    
    
    
}
