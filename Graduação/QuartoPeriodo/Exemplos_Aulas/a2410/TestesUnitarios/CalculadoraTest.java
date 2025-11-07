package a2410.TestesUnitarios;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void somaTest(){
        Calculadora c = new Calculadora();
        Assert.assertEquals(5, c.soma(2, 3));
    }
}
