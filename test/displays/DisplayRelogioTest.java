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
public class DisplayRelogioTest {
    
    public DisplayRelogioTest() {
    }

    @Test
    public void testInicializacao() {
        DisplayRelogio dr1 = new DisplayRelogio();
        assertEquals(dr1.mostraDisplay(), "00:00");
    }
    
    @Test
    public void testSetTime() {
        
        System.out.println("setTime");
        
        //PREPARAÇÃO
        DisplayRelogio instance = new DisplayRelogio();
        Integer novaHora = 20;
        Integer novoMinuto = 40;
        String expResult = "20:40";
        
        //EXECUÇÃO
        instance.setTime(novaHora, novoMinuto);
        
        //VERIFICAÇÃO
        assertEquals(expResult, instance.mostraDisplay());
    }
    
    @Test
    public void testTick() {
        System.out.println("setTime");
        
        //PREPARAÇÃO
        DisplayRelogio instance = new DisplayRelogio();
        Integer novaHora = 20;
        Integer novoMinuto = 40;
        String expResult = "20:41";
        instance.setTime(novaHora, novoMinuto);
        
        //EXECUÇÃO
        instance.tick();
        
        //VERIFICAÇÃO
        assertEquals(expResult, instance.mostraDisplay());
        
        
        System.out.println("setTime2");
        
        //PREPARAÇÃO
        instance = new DisplayRelogio();
        novaHora = 20;
        novoMinuto = 59;
        expResult = "21:00";
        instance.setTime(novaHora, novoMinuto);
        
        //EXECUÇÃO
        instance.tick();
        
        //VERIFICAÇÃO
        assertEquals(expResult, instance.mostraDisplay());
        System.out.println(instance.mostraDisplay());
    }
}
