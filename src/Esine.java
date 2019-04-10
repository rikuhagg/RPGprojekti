
public class Esine {
	private String nimi;
	private int voima;
	private int nopeus;
	private int taika;
	
	
	public Esine(String nimi, int voima, int nopeus, int taika) {
		this.nimi = nimi;
		this.voima = voima;
		this.nopeus = nopeus;
		this.taika = taika;
		
	}
	public void tulostaEsine() {
		System.out.println("Nimi: " + nimi);
		System.out.println("Voima: +" + voima);
		System.out.println("Nopeus: +" + nopeus);
		System.out.println("Taika: +" + taika + "\n");
	}
	
	public int getTaika() {
		return taika;
	}
	
	public int getVoima() {
		return voima;
	}
	
	public int getNopeus() {
		return nopeus;
	}
}
