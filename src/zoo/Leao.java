/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Lenovo
 */
public class Leao extends Animal {
    
    private double quantCarneDia;
    
    public Leao(String nome, double peso, double quantCarneDia) {
        super(nome, peso);
        this.quantCarneDia = quantCarneDia;
    }
    
    @Override
    public void alimentar(){
        System.out.println("Joga comida e corre!!!");
    }

    @Override
    public String toString() {
        return "Leão "+nome+" de peso "+peso+" que"
                + " come "+quantCarneDia+ " kg de carne por dia"
                + ". Antes era podre: "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
