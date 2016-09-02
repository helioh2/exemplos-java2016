/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Lenovo
 */
public enum FaixaPreco {
    
    BARATO("Barato"), 
    MODERADO("Moderado"), 
    CARO("Caro");

    private final String valor;
    
    private FaixaPreco(String faixaPreco) {
        this.valor = faixaPreco;
    }
    
    
    
}
