/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.ArrayList;
import java.util.List;


public class MainFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura quad1 = new Quadrado(30.0, 
                            new Posicao(20.0, 50.0));
        quad1.desenhar();
        //quad1.darPirueta();
        
        Figura circulo1 = new Circulo(20.0, 
                                new Posicao(0.0,0.0));
        circulo1.desenhar();
        
        //circulo1 = quad1;
        
        //circulo1.desenhar();
        
        List<Figura> lista1 = new ArrayList<Figura>();
        lista1.add(quad1);
        lista1.add(circulo1);
        desenhaTudo(lista1);
    }
    
    public static void desenhaTudo(List<Figura> figuras) {
        for (Figura fig: figuras) {
            fig.desenhar();
        }
    }
    
}
