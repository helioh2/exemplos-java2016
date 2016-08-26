/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banco.conta.ContaCorrente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class ContaCorrenteTest {

    private ContaCorrente cc1;
    private ContaCorrente cc2;
    private Double valorDeposito = 500.0;

    public ContaCorrenteTest() {
        cc1 = new ContaCorrente("helio", "2828282");
        cc2 = new ContaCorrente("fulano", "27272");
    }
    
    
    @Test
    public void testNumConta() {
        assertEquals(cc1.getNumConta(), 1);
        assertEquals(cc2.getNumConta(), 2);
    }
   
    @Test
    public void testDepositar() {
        
        assertTrue(cc1.depositar(valorDeposito));
        assertEquals(cc1.getSaldo(), valorDeposito);
        
    }
    
    @Test
    public void testSacar(){
        
        
        cc1 = new ContaCorrente("helio", "2828282");
        cc1.depositar(valorDeposito);
        Double valorSaque = 300.0;
        assertTrue(cc1.sacar(valorSaque));
        assertEquals(cc1.getSaldo(), 
                Double.valueOf(valorDeposito - valorSaque));
        
        assertFalse(cc1.sacar(valorSaque));
        assertEquals(cc1.getSaldo(), 
                Double.valueOf(valorDeposito - valorSaque));
        
        // caso em que transfere
        Double saldoCc1Atual = cc1.getSaldo();
        Double valorTransferencia = 100.0;
        assertTrue(cc1.transferir(cc2,valorTransferencia));
        assertEquals(cc1.getSaldo(), 
                Double.valueOf(saldoCc1Atual - valorTransferencia));
        assertEquals(cc2.getSaldo(),
                valorTransferencia);
        
        // caso em que não transfere
        Double valorTransf2 = 200.0;
        assertFalse(cc2.transferir(cc1, valorTransf2));
        assertEquals(cc1.getSaldo(), 
                Double.valueOf(saldoCc1Atual - valorTransferencia));
        assertEquals(cc2.getSaldo(),
                valorTransferencia);
    }
    
}
