/**
 * Esine -luokka kuvaa peliss� hahmolle annettavia esineit�, kuten aseita tai potioneita.
 * @author Riku
 *
 */
public class Esine {
	private String nimi;
	private int att;
	private int spe;
	private int def;
	
	/**
	 * T�m� konstruktori luo uuden esineen parametrin� annetuilla arvoilla.
	 * @param nimi esineen nimi
	 * @param att esineen hy�kk�ys
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
	 * T�m� metodi palauttaa esineen hy�kk�ysarvon.
	 * @return esineen hy�kk�ys
	 */
	public int getAtt() {
		return att;
	}
	
	/**
	 * T�m� metodi palauttaa esineen puolustusarvon.
	 * @return
	 */
	public int getDef() {
		return def;
	}
	
	/**
	 * T�m� metodi palauttaa esineen nopeusarvon
	 * @return esineen nopeus
	 */
	public int getSpe() {
		return spe;
	}
	
	/**
	 * T�m� metodi tulostaa k�ytt�j�n n�yt�lle esineen tiedot
	 */
	public void tulostaEsine() {
		System.out.println("Nimi: " + nimi);
		System.out.println("Hy�kk�ys: +" + att);
		System.out.println("Nopeus: +" + spe);
		System.out.println("Puolustus: +" + def + "\n");
	}
}
