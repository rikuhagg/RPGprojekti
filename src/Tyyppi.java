
public class Tyyppi {
	private String tyyppi;
	private String nimi;
	private int voima;
	private int nopeus;
	private int taika;
	
	public Tyyppi(String tyyppi, String nimi, int voima, int nopeus, int taika) {
		this.tyyppi = tyyppi;
		this.nimi = nimi;
		this.voima = voima;
		this.nopeus = nopeus;
		this.taika = taika;
	}
	
	public String returnNimi() {
		return nimi;
	}
	
	public int returnVoima() {
		return voima;
	}
	
	public int returnNopeus() {
		return nopeus;
	}
	
	public int returnTaika() {
		return taika;
	}
	
	public void tulostaTiedot() {
		tulosta("=========================\n");
		tulosta(tyyppi + ": " + nimi);
		tulosta("Voima: +" + voima);
		tulosta("Nopeus: +" + nopeus);
		tulosta("Taika: +" + taika + "\n");
	}
	
	public void tulosta(String lause) {
		System.out.println(lause);
	}
	
	public String toString() {
		return this.nimi;
	}
}
