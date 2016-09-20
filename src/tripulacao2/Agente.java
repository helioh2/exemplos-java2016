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
public class Agente implements IPessoa {
    
    private int idAgente;
    private Pessoa pessoa;

    public Agente() {
        pessoa = new Pessoa();
    }

    public Agente(int idAgente, Pessoa pessoa) {
        this.idAgente = idAgente;
        this.pessoa = pessoa;
    }
    
    

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
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
