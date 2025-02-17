package imc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculoIMCTeste {

	CalculoIMC calculadora;
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
    public void testAbaixoDoPeso() {
		calculadora = new CalculoIMC(45, 1.75);
        double imc = calculadora.calcularIMC();
        String classificacao = calculadora.classificarIMC();

        assertEquals(14.69, imc, 0.01);
        assertEquals("Abaixo do peso", classificacao);
    }

    @Test
    public void testPesoNormal() {
    	calculadora = new CalculoIMC(70, 1.75);
        double imc = calculadora.calcularIMC();
        String classificacao = calculadora.classificarIMC();

        assertEquals(22.86, imc, 0.01);
        assertEquals("Peso normal", classificacao);
    }

    @Test
    public void testSobrepeso() {
    	calculadora = new CalculoIMC(80, 1.75);
        double imc = calculadora.calcularIMC();
        String classificacao = calculadora.classificarIMC();

        assertEquals(26.12, imc, 0.01);
        assertEquals("Sobrepeso", classificacao);
    }

    @Test
    public void testObeso() {
    	calculadora = new CalculoIMC(100, 1.75);
        double imc = calculadora.calcularIMC();
        String classificacao = calculadora.classificarIMC();

        assertEquals(32.65, imc, 0.01);
        assertEquals("Obeso", classificacao);
    }

    @Test
    public void testObesoMorbido() {
    	calculadora = new CalculoIMC(130, 1.75);
        double imc = calculadora.calcularIMC();
        String classificacao = calculadora.classificarIMC();

        assertEquals(42.45, imc, 0.01);
        assertEquals("Obeso mórbido", classificacao);
    }

}
