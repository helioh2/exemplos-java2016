
package casa;


public class Pessoa {
    
    private String nome;
    
    private Comodo comodoAtual;

    public Pessoa(String nome, Comodo comodoAtual) {
        this.nome = nome;
        this.comodoAtual = comodoAtual;
        this.comodoAtual.addPessoa(this);
    }
    
    
    
}
