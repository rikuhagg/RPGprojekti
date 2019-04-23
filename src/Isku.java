/**
 * T�m� isku kuvaa hahmolle kuuluvaa yksitt�ist� iskua, joita k�ytet��n taistelu luokassa
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
	 * T�m� konstruktori antaa iskulle sen arvot
	 * @param nimi iskun nimi
	 * @param att nimi Hy�kk�ysarvo
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
	 * T�m� metodi palauttaa iskun tarkkuusarvon
	 * @return iskun tarkkuus
	 */
	public int getAcc() {
		return acc;
	}
	
	/**
	 * T�m� metodi palauttaa iskun Hy�kk�ysarvon
	 * @return iskun hy�kk�ys
	 */
	public int getAtt() {
		return att;
	}
	
	/**
	 * T�m� metodi palauttaa iskun heikoimman kohteen
	 * @return iskun heikkous
	 */
	public String getHeikkous() {
		return heikkous;
	}
	
	/**
	 * T�m� metodi palauttaa iskun nimen
	 * @return iskun nimi
	 */
	public String getNimi() {
		return nimi;
	}
	
	/**
	 * T�m� metodi palauttaa iskun nopeuden
	 * @return iskun nopeus
	 */
	public int getSpe() {
		return spe;
	}
	
	/**
	 * T�m� metodi palauttaa iskun vahvimman kohteen
	 * @return iskun vahvuus
	 */
	public String getVahvuus() {
		return vahvuus;
	}

}
