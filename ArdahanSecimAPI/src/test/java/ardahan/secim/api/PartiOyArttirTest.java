package ardahan.secim.api;

import static org.junit.Assert.*;


import org.junit.Test;



public class PartiOyArttirTest {

	@Test
	public void testOyArttir() {
		
		
	        PartiOyArttir partiOyArttir = new PartiOyArttir();
	        
	        // AKP oyunu artırma testi
	        partiOyArttir.oyArttir("akp");
	       assertEquals(1, partiOyArttir.getAkpOy());
	       assertEquals(0, partiOyArttir.getChpOy());

	        // CHP oyunu arttırma testi
	        partiOyArttir.oyArttir("chp");
	        assertEquals(1, partiOyArttir.getAkpOy());
	        assertEquals(1, partiOyArttir.getChpOy());

	        // Yanlış parti testi
	        partiOyArttir.oyArttir("xyz");
	        assertEquals(1, partiOyArttir.getAkpOy());
	        assertEquals(1, partiOyArttir.getChpOy());
	    }
		
	
}
