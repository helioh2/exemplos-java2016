/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.funcionarios;

/**
 *
 * @author Lenovo
 */
public abstract class Funcionario implements Comparable<Funcionario> {
    
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double getBonificacao();
    
    private void xingar() {
        System.out.println("%#$$$$$**$@#@");
    }
    
    @Override
    public int compareTo(Funcionario o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return nome;
    }

    
    
}
