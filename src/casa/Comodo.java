/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Comodo {
    
    private Lampada lampada;
    private List<Movel> moveis;
    private List<Pessoa> pessoas;

    public Comodo() {
        moveis = new ArrayList<>();
        pessoas = new ArrayList<>();
        
    }
    
    public void iluminar() {
        lampada.acender();
    }

    public void setLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public void setMoveis(List<Movel> moveis) {
        this.moveis = moveis;
    }
    
    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    
    
    
    
    
}
