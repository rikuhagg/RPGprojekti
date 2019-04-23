/**
 * Tämä isku kuvaa hahmolle kuuluvaa yksittäistä iskua, joita käytetään taistelu luokassa
 * @author Riku
 *
 */
public class Isku {
	private String nimi;
	private int att;
	private int spe;
	private int acc;
	private String heikkous;
	private String vahvuus;
	
	/**
	 * Tämä konstruktori antaa iskulle sen arvot
	 * @param nimi iskun nimi
	 * @param att nimi Hyökkäysarvo
	 * @param spe iskun nopeusarvo
	 * @param acc iskun tarkkuusarvo
	 * @param heikkous iskon heikkous kohde
	 * @param vahvuus iskun vahvuuskohde
	 */
	public Isku(String nimi, int att, int spe, int acc, String heikkous, String vahvuus) {
		this.nimi = nimi;
		this.att = att;
		this.spe = spe;
		this.acc = acc;
		this.heikkous = heikkous;
		this.vahvuus = vahvuus;
	}
	
	/**
	 * Tämä metodi palauttaa iskun tarkkuusarvon
	 * @return iskun tarkkuus
	 */
	public int getAcc() {
		return acc;
	}
	
	/**
	 * Tämä metodi palauttaa iskun Hyökkäysarvon
	 * @return iskun hyökkäys
	 */
	public int getAtt() {
		return att;
	}
	
	/**
	 * Tämä metodi palauttaa iskun heikoimman kohteen
	 * @return iskun heikkous
	 */
	public String getHeikkous() {
		return heikkous;
	}
	
	/**
	 * Tämä metodi palauttaa iskun nimen
	 * @return iskun nimi
	 */
	public String getNimi() {
		return nimi;
	}
	
	/**
	 * Tämä metodi palauttaa iskun nopeuden
	 * @return iskun nopeus
	 */
	public int getSpe() {
		return spe;
	}
	
	/**
	 * Tämä metodi palauttaa iskun vahvimman kohteen
	 * @return iskun vahvuus
	 */
	public String getVahvuus() {
		return vahvuus;
	}

}
