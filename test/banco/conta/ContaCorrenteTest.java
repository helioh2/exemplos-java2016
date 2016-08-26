/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.conta;

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
    
    public ContaCorrenteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of depositar method, of class ContaCorrente.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        Double quantia = null;
        ContaCorrente instance = null;
        boolean expResult = false;
        boolean result = instance.depositar(quantia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class ContaCorrente.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        ContaCorrente instance = null;
        Double expResult = null;
        Double result = instance.getSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumConta method, of class ContaCorrente.
     */
    @Test
    public void testGetNumConta() {
        System.out.println("getNumConta");
        ContaCorrente instance = null;
        int expResult = 0;
        int result = instance.getNumConta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class ContaCorrente.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        Double quantia = null;
        ContaCorrente instance = null;
        boolean expResult = false;
        boolean result = instance.sacar(quantia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transferir method, of class ContaCorrente.
     */
    @Test
    public void testTransferir() {
        System.out.println("transferir");
        ContaCorrente outraConta = null;
        Double quantia = null;
        ContaCorrente instance = null;
        boolean expResult = false;
        boolean result = instance.transferir(outraConta, quantia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
