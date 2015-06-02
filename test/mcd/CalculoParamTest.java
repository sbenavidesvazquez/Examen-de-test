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
public class CalculoParamTest {

    @RunWith(Parameterized.class)
    public class CalculatestParamTest {

        private int inputnum1;
        private int inputnum2;
        private int resulesp;
        private Calculo calculo;

        @Before
        public void initialize() {
            calculo = new Calculo();
        }

        public CalculatestParamTest(Integer inputnum1,
                Integer inputnum2, int resultesp) {
            this.inputnum1 = inputnum1;
            this.inputnum2 = inputnum2;
            this.resulesp = resultesp;
        }

        /**
         *
         * @return
         */
        @Parameterized.Parameters
        public Collection primeNumbers() {
            return Arrays.asList(new Object[][]{
                {2, 2, 1},
                {7, 2, 1},
                {6, 4, 2},
                {8, 2, 4}
            });
        }

        @Test
        public void testPrimeNumberChecker() {
            System.out.println("Parameterized Number is : " + inputnum1 + inputnum2);
            assertEquals(resulesp,
                    Calculo.obtenerMCD(inputnum1, inputnum2));
        }
    }
}
