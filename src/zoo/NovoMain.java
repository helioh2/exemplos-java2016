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
public class NovoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal leao = new Leao("leo", 136, 2.26);
        leao.alimentar();
        System.out.println(leao.toString());
        Object obj = null;
        
    }
    
}
