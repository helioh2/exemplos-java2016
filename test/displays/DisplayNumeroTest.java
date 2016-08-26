/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displays;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class DisplayNumeroTest {
    
    public DisplayNumeroTest() {
    }

    /**
     * Test of getValor method, of class DisplayNumero.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        DisplayNumero instance = new DisplayNumero(24);
        String expResult = "00";
        String result = instance.getValor();
        assertEquals(expResult, result);
        
       
    }
    
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        DisplayNumero instance = new DisplayNumero(60);
        Integer novoValor = 30;
        String expResult = "30";
        instance.setValor(novoValor);
        assertEquals(expResult, instance.getValor());
        
        System.out.println("setValor2");
        instance = new DisplayNumero(60);
        Integer novoValor2 = 70;
        String expResult2 = "00";
        instance.setValor(novoValor2);
        assertEquals(expResult2, instance.getValor());
    }
    
}
