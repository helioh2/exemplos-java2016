/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author Lenovo
 */
public class NovoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.adicionarNoFim("Hello");
        System.out.println(fila);
        fila.adicionarNoFim("World");
        System.out.println(fila);
        fila.removeDoInicio();
        System.out.println(fila);
        fila.adicionarNoFim("Hello");
        System.out.println(fila);
        fila.remove(1);
        System.out.println(fila);
        
        FilaCerto fila2 = new FilaCerto();
        int n = 13;
        fila2.adicionarNoFim("olá");
        fila2.adicionarNoFim("mundo");
        System.out.println(fila2);
        fila2.removeDoInicio();
        System.out.println(fila2);
    }
    
}
