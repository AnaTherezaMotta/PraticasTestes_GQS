package numero;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeroTeste {

	Numero objNum;
	@Before
	public void setUp() throws Exception {
		objNum = new Numero();
	}

	@Test
	public void testRaizCubica() {
		assertEquals("CASO 1: ", 3, objNum.raizCubica(27), 0);
		assertEquals("CASO 2: ", 2.71, objNum.raizCubica(20), 0.01);
	}

	@Test
	public void testFatorial() {
		assertEquals("CASO 3: ", 120, objNum.fatorial(5));
		assertEquals("CASO 4: ", 1, objNum.fatorial(0));
	}

	@Test
	public void testSomaIntervalo() {
		assertEquals("CASO 5: ", 15, objNum.somaIntervalo(5));
		assertEquals("CASO 6: ", 0, objNum.somaIntervalo(0));
	}



}
