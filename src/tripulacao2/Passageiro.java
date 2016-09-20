/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripulacao2;

/**
 *
 * @author Helio
 */
public class Passageiro implements IPessoa {
    private String numeroSmiles;
    private Pessoa pessoa;

    public Passageiro() {
        pessoa = new Pessoa();
    }

    
    
    public String getNumeroSmiles() {
        return numeroSmiles;
    }

    public void setNumeroSmiles(String numeroSmiles) {
        this.numeroSmiles = numeroSmiles;
    }
    
    public String getNome(){
        return pessoa.getNome();
    }
    
    public void setNome(String nome) {
        pessoa.setNome(nome);
    }

    @Override
    public String getEndereco() {
        return pessoa.getEndereco();
    }

    @Override
    public void setEndereco(String endereco) {
        pessoa.setEndereco(endereco);
    }
    
}
