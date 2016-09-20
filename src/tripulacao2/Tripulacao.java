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
public class Tripulacao implements IPessoa{
    
    private int idTripulacao;
    private Pessoa pessoa;

    public Tripulacao(int idTripulacao, Pessoa pessoa) {
        this.idTripulacao = idTripulacao;
        this.pessoa = pessoa;
    }

    
    
    public int getIdTripulacao() {
        return idTripulacao;
    }

    public void setIdTripulacao(int idTripulacao) {
        this.idTripulacao = idTripulacao;
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
