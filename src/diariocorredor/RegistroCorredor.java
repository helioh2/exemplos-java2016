/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariocorredor;

import data.Data;

/**
 *
 * @author Lenovo
 */
public class RegistroCorredor {
    
    private Data data;
    private double distancia;
    private double duracao;
    private String disposicao;

    public RegistroCorredor(Data data, double distancia, double duracao, String disposicao) {
        this.data = data;
        this.distancia = distancia;
        this.duracao = duracao;
        this.disposicao = disposicao;
    }
    
    
    
    
}
