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
public class Tripulacao {
    
    private int idTripulacao;
    private Pessoa pessoa = new Pessoa();

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
    
}
