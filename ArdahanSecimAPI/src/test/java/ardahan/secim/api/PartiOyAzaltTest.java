package ardahan.secim.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartiOyAzaltTest {

	@Test
    public void testOyAzalt() {
        PartiOyAzalt partiOyAzalt = new PartiOyAzalt();

        // AKP oyunu azaltma testi
        partiOyAzalt.oyAzalt("akp");
        assertEquals(0, partiOyAzalt.getAkpOy());
        assertEquals(0, partiOyAzalt.getChpOy());

        // CHP oyunu azaltma testi
        partiOyAzalt.oyAzalt("chp");
        assertEquals(0, partiOyAzalt.getAkpOy());
        assertEquals(0, partiOyAzalt.getChpOy());

        // Oy sayısı sıfır olduğunda azaltma testi
        partiOyAzalt.oyAzalt("akp");
        assertEquals(0, partiOyAzalt.getAkpOy());
        assertEquals(0, partiOyAzalt.getChpOy());
    }

}
