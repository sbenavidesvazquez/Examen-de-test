/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oracle
 */
public class CalculoTest {
    
    public CalculoTest() {
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
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 6;
        int num2 = 4;
        Calculo cal = new Calculo();
        int expResult = 2;
        int result = cal.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("obtenerMCD");
        int num3 = 10;
        int num4 = 5;
        Calculo cal2 = new Calculo();
        int expResult2 = 5;
        int result2 = cal2.obtenerMCD(num3, num4);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("obtenerMCD");
        int num5 = 10;
        int num6 = 50;
        Calculo cal3 = new Calculo();
        int expResult3 = 10;
        int result3 = cal3.obtenerMCD(num5, num6);
        assertEquals(expResult3, result3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
