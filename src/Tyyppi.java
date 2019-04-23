
public class Tyyppi {
	private String tyyppi;
	private String nimi;
	private int att;
	private int spe;
	private int def;
	
	public Tyyppi(String tyyppi, String nimi, int voima, int nopeus, int taika) {
		this.tyyppi = tyyppi;
		this.nimi = nimi;
		this.att = voima;
		this.spe = nopeus;
		this.def = taika;
	}
	
	public String getNimi() {
		return nimi;
	}
	
	public int getAtt() {
		return att;
	}
	
	public int getSpe() {
		return spe;
	}
	
	public int getDef() {
		return def;
	}
	
	public void tulostaTiedot() {
		tulosta("=========================\n");
		tulosta(tyyppi + ": " + nimi);
		tulosta("Hyökkäys: +" + att);
		tulosta("Nopeus: +" + spe);
		tulosta("Puolustus: +" + def + "\n");
	}
	
	public void tulosta(String lause) {
		System.out.println(lause);
	}
	
	public String toString() {
		return this.nimi;
	}
}
