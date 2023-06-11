package ardahan.secim.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartiOyGosterimTest {

	@Test
    public void testOyGetir() {
        PartiOyGosterim partiOyGosterim = new PartiOyGosterim(123, 456);

        assertEquals(123, partiOyGosterim.getAkpOy());
        assertEquals(456, partiOyGosterim.getChpOy());
    }

}
