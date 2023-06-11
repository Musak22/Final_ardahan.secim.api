package ardahan.secim.api;

public class PartiOyArttir {
	
	
	    private int akpOy = 0;
	    private int chpOy = 0;

	    public void oyArttir(String parti) {
	        if (parti.equals("akp")) {
	            akpOy++;
	        } else if (parti.equals("chp")) {
	            chpOy++;
	        }
	    }

	    public int getAkpOy() {
	        return akpOy;
	    }

	    public int getChpOy() {
	        return chpOy;
	    }
		
	
	

}
