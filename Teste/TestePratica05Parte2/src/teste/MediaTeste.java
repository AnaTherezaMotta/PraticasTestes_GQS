package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import media.Media;

public class MediaTeste {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testCalcularMedia_Vetor1() {
	    double[] vet1 = {90, 88, 78, 76};
	    double mediaEsperada = (90 + 88 + 78 + 76) / 4.0;
	    double mediaCalculada = Media.calcularMedia(vet1);
	    assertEquals(mediaEsperada, mediaCalculada, 0.001); 
	}

	@Test
	public void testCalcularMedia_Vetor2() {
	    double[] vet2 = {865, 564, 43, 12};
	    double mediaEsperada = (865 + 564 + 43 + 12) / 4.0;
	    double mediaCalculada = Media.calcularMedia(vet2);
	    assertEquals(mediaEsperada, mediaCalculada, 0.001); 
	}

}
