package ardahan.secim.api;

public class PartiOyAzalt {
	
	
	
	private int akpOy = 0;
    private int chpOy = 0;

    public void oyAzalt(String parti) {
        if (parti.equals("akp")) {
            if (akpOy > 0) {
                akpOy--;
            }
        } else if (parti.equals("chp")) {
            if (chpOy > 0) {
                chpOy--;
            }
        }
    }

    public int getAkpOy() {
        return akpOy;
    }

    public int getChpOy() {
        return chpOy;
    }

}
