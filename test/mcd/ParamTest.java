/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author oracle
 */
@RunWith(Parameterized.class)
public class ParamTest {

    private int inputnum1;
    private int inputnum2;
    private int resulesp;
    private Calculo calculo;

    @Before
    public void initialize() {
        calculo = new Calculo();
    }

    public ParamTest(int num1, int num2, int resul) {
        this.inputnum1 = num1;
        this.inputnum2 = num2;
        this.resulesp = resul;
    }

    /**
     *
     * @return
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {22, 2, 2},
            {8, 4, 4},
            {6, 12, 6},
            {8, 4, 4}
        });
    }

    @Test
    public void testPrimeNumbresCheked() {
        System.out.println("Parameterized Number is : " + resulesp);
        assertEquals(resulesp,
                calculo.obtenerMCD(inputnum1, inputnum2));
    }
}
