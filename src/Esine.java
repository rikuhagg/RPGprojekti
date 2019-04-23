/**
 * Esine -luokka kuvaa pelissä hahmolle annettavia esineitä, kuten aseita tai potioneita.
 * @author Riku
 *
 */
public class Esine {
	private String nimi;
	private int att;
	private int spe;
	private int def;
	
	/**
	 * Tämä konstruktori luo uuden esineen parametrinä annetuilla arvoilla.
	 * @param nimi esineen nimi
	 * @param att esineen hyökkäys
	 * @param spe esineen nopeus
	 * @param def esineen puolustus
	 */
	public Esine(String nimi, int att, int spe, int def) {
		this.nimi = nimi;
		this.att = att;
		this.spe = spe;
		this.def = def;
		
	}
	
	/**
	 * Tämä metodi palauttaa esineen hyökkäysarvon.
	 * @return esineen hyökkäys
	 */
	public int getAtt() {
		return att;
	}
	
	/**
	 * Tämä metodi palauttaa esineen puolustusarvon.
	 * @return
	 */
	public int getDef() {
		return def;
	}
	
	/**
	 * Tämä metodi palauttaa esineen nopeusarvon
	 * @return esineen nopeus
	 */
	public int getSpe() {
		return spe;
	}
	
	/**
	 * Tämä metodi tulostaa käyttäjän näytölle esineen tiedot
	 */
	public void tulostaEsine() {
		System.out.println("Nimi: " + nimi);
		System.out.println("Hyökkäys: +" + att);
		System.out.println("Nopeus: +" + spe);
		System.out.println("Puolustus: +" + def + "\n");
	}
}
