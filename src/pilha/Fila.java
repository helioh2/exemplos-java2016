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
public class Fila extends Vector<Object>{
    
    public void adicionarNoFim(Object obj) {
        this.add(obj);
    }
    
    public Object removeDoInicio(){
        return this.remove(0);
    }
    
}
