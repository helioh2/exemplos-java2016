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
public class Restaurante {
    
    private String nome;
    private String tipo;
    private FaixaPreco faixaPreco;
    private Esquina esquinaMaisProxima;

    public Restaurante(String nome, String tipo, FaixaPreco faixaPreco, Esquina esquinaMaisProxima) {
        this.nome = nome;
        this.tipo = tipo;
        this.faixaPreco = faixaPreco;
        this.esquinaMaisProxima = esquinaMaisProxima;
    }
    
    public static void main(String[] args) {
        FaixaPreco fp1 = FaixaPreco.BARATO;
        Esquina es1 = new Esquina("pioneiro", "independencia");
        Restaurante r1 = new Restaurante("Viletto", "Pizzaria", fp1, es1);
        
        
    }
    
    
    
}
