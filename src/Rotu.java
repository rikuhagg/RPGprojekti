
public class Rotu {
	private String nimi;
	private int voima;
	private int nopeus;
	private int taika;
	
	public Rotu(String nimi, int voima, int nopeus, int taika) {
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
		t("=========================\n");
		t("Rotu: " + nimi);
		t("Voima: +" + voima);
		t("Nopeus: +" + nopeus);
		t("Taika: +" + taika + "\n");
	}
	
	public void t(String lause) {
		System.out.println(lause);
	}
}
