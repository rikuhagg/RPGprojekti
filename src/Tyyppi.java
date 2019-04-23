/**
 * Tyyppi luokka kuvaa yksittäistä rotua tai luokkaa.
 * 
 * @author Riku
 *
 */
public class Tyyppi {
	private String tyyppi;
	private String nimi;
	private int att;
	private int spe;
	private int def;
	private Isku isku;
	
	/**
	 * Tämä konstruktori asettaa tyypille sen kaikki arvot
	 * @param tyyppi  määrittää onko kyseessä luokka vai rotu
	 * @param nimi tyypin nimi
	 * @param att tyypin antama attack bonus
	 * @param spe tyypin antama speed bonus
	 * @param def tyypin antama defense bonus
	 * @param isku tyypin antaman iskun nimi
	 * @param iAtt tyypin antaman iskun hyökkäys 
	 * @param iSpe tyypin antaman iskun nopeus
	 * @param iAcc tyypin antama iskun tarkkuus
	 * @param heikkous tyypin antaman iskun heikkous
	 * @param vahvuus tyypin antaman iskun vahvuus
	 */
	public Tyyppi(String tyyppi, String nimi, int att, int spe, int def, String isku, int iAtt, int iSpe, int iAcc, String heikkous, String vahvuus) {
		this.tyyppi = tyyppi;
		this.nimi = nimi;
		this.att = att;
		this.spe = spe;
		this.def = def;
		this.isku = new Isku(isku,iAtt,iSpe,iAcc,heikkous,vahvuus);
	}
	
	
	/**
	 * Metodi palauttaa tyypin hyökkäys arvon.
	 * @return palauttaa att muuttujan arvon
	 */
	public int getAtt() {
		return att;
	}
	
	/**
	 * Metodi palauttaa tyypin puolustus arvon.
	 * @return palauttaa att muuttujan arvon
	 */
	public int getDef() {
		return def;
	}
	
	/**
	 * Metodi palauttaa tyypin ominaisiskun.
	 * @return palauttaa ominaisiskun
	 */
	public Isku getIsku() {
		return isku;
	}
	
	/**
	 * Metodi palauttaa tyypin nimen.
	 * @return palauttaa nimen
	 */
	public String getNimi() {
		return nimi;
	}
	
	/**
	 * Metodi palauttaa tyypin nopeus arvon.
	 * @return palauttaa spe muuttujan arvon
	 */
	public int getSpe() {
		return spe;
	}
	
	/**
	 * tämä metodi tulostaa tyypin tiedot käyttäjälle
	 */
	public void tulostaTiedot() {
		tulosta("=========================\n");
		tulosta(tyyppi + ": " + nimi);
		tulosta("Hyökkäys: +" + att);
		tulosta("Nopeus: +" + spe);
		tulosta("Puolustus: +" + def + "\n");
	}
	
	private void tulosta(String lause) {
		System.out.println(lause);
	}
}
