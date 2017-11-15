package me.polovinskycode.exemple.pure;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PureFunctionTest {

    private PureFunction pure;

    @Before
    public void setUp() throws Exception {
        pure = new PureFunction();
    }

    @Test
    public void soma_comValorA_comValorB_deveRetonarSomaDosDoisValores() throws Exception {
        Double x = 5d;
        Double y = 5d;
        Double resultado = pure.somar(x, y);
        Assert.assertThat(resultado, Matchers.equalTo(10d));
    }
}