package quadratic;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EquacaoTeste {

    @Test
    public void testEquacaoSegundoGrau_ComDeltaPositivo() {
        String resultado = Equacao.calcularEquacao(1, -3, 2);
        String esperado = "Esta e uma equacao de segundo grau\n" +
                          "Delta: 1.0\nx': 2.0\nx'': 1.0\n";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testEquacaoSegundoGrau_ComDeltaZero() {
        String resultado = Equacao.calcularEquacao(1, -2, 1);
        String esperado = "Esta e uma equacao de segundo grau\n" +
                          "Esta equacao possui duas raizes iguais: X = 1.0";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testEquacaoSegundoGrau_ComDeltaNegativo() {
        String resultado = Equacao.calcularEquacao(1, 1, 1);
        String esperado = "Esta e uma equacao de segundo grau\n" +
                          "Esta equacao nao possui raizes reais: Delta = -3.0";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testEquacaoPrimeiroGrau() {
        String resultado = Equacao.calcularEquacao(0, 2, -4);
        String esperado = "Esta e uma equacao de primeiro grau. X = 2.0";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testIgualdadeZero() {
        String resultado = Equacao.calcularEquacao(0, 0, 0);
        String esperado = "Igualdade confirmada 0=0";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testCoeficientesIncorretos() {
        String resultado = Equacao.calcularEquacao(0, 0, 5);
        String esperado = "Coeficientes informados incorretamente";
        assertEquals(esperado, resultado);
    }
}