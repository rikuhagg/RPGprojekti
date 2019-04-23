import java.util.*;
import java.io.*;

/**
 * Hahmo luokka kuvaa yksitt�ist� hahmoa peliss�.
 * Hahmo voi olla joko pelaajan ohjaama p��henkil� tai tietokoneen ohjaama vastustaja
 *   
 * @author Riku
 *
 */
public class Hahmo {
	private Scanner lukija;
	private String nimi;
	private int att;
	private int spe;
	private int def;
	private int hp;
	private int maxHp;
	private int rahat;
	private int lvl;
	private int xp;
	private int maxXp;
	private int kokemus;
	private Esine[] esineet;
	private Tyyppi luokka;
	private Tyyppi rotu;
	private Isku[] iskut;
	
	/**
	 * T�m� konstruktori luo hahmon ja antaa sille sen perusarvot
	 */
	public Hahmo() {
		this.lukija = new Scanner(System.in);
		this.nimi = null;
		this.luokka = null;
		this.rotu = null;
		this.att = 0;
		this.spe = 0;
		this.def = 0;
		this.hp = 15;
		this.maxHp = 15;
		this.lvl = 1;
		this.xp = 0;
		this. maxXp = 500;
		this.kokemus = 0;
		this.esineet = new Esine[5];
		this.iskut = new Isku[3];
		iskut[0] = new Isku("Potkaise",2,6,9,"Null","Null");
		
	}
	
	/**
	 * Metodi palauttaa hahmon hy�kk�ys arvon.
	 * @return palauttaa att muuttujan arvon
	 */
	public int getAtt() {
		return att;
	}
	
	/**
	 * Metodi palauttaa hahmon puolustus arvon.
	 * @return palauttaa def muuttujan arvon
	 */
	public int getDef() {
		return def;
	}
	
	/**
	 * Metodi palauttaa hahmon healt points arvon.
	 * @return palauttaa hp muuttujan arvon
	 */
	public int getHp() {
		return hp;
	}
	
	/**
	 * Metodi palauttaa indeksill� kutsutun iskun, Iskut listasta
	 * @param i halutun iskun indeksi
	 * @return palauttaa yksit�isen isku tyyppisen muuttujan
	 */
	public Isku getIsku(int i) {
		return iskut[i];
	}
	
	/**
	 * Metodi palauttaa hahmon luokan.
	 * @return palauttaa luokan
	 */
	public String getLuokka() {
		return luokka.getNimi();
	}
	
	/**
	 * Metodi palauttaa hahmon levelin eli kehittyneisyyden.
	 * @return palauttaa lvl muuttujan arvon
	 */
	public int getLvl() {
		return lvl;
	}
	
	/**
	 * Metodi palauttaa hahmon t�ydet healtpointsit.
	 * @return palauttaa maxHp muuttujan arvon
	 */
	public int getMaxHp() {
		return maxHp;
	}
	
	/**
	 * Metodi palauttaa kehittymiseen vaadittavan xp pisteiten m��r�n.
	 * @return palauttaa maxXp muuttujan arvon
	 */
	public int getMaxXp() {
		return maxXp;
	}
	
	/**
	 * Metodi palauttaa hahmon nimen.
	 * @return palauttaa nimi muuttujan arvon
	 */
	public String getNimi() {
		return nimi;
	}
	
	/**
	 * Metodi palauttaa hahmon hy�kk�ys arvon.
	 * @return palauttaa att muuttujan arvon
	 */
	public int getRahat() {
		return rahat;
	}
	
	/**
	 * Metodi palauttaa hahmon rodun.
	 * @return palauttaa rodun.
	 */
	public String getRotu() {
		return rotu.getNimi();
	}
	
	/**
	 * Metodi palauttaa hahmon nopeus arvon.
	 * @return palauttaa spe muuttujan arvon
	 */
	public int getSpe() {
		return spe;
	}
	
	/**
	 * Metodi palauttaa hahmon sen hetkisen xp-tilanteen.
	 * @return palauttaa xp muuttujan arvon
	 */
	public int getXp() {
		return xp;
	}
	
	/**
	 * T�ll� metodilla on mahdollista kehitt�� att, spe ja def arvoja kaikkia yhdell� kutsulla.
	 * @param att haluttu muutos att arvolle
	 * @param spe haluttu muutos spe arvolle
	 * @param def haluttu muutos def arvolle
	 */
	public void kehita(int at,int sp, int de) {
		att += at;
		spe += sp;
		def += de;
		}
	
	/**
	 * T�m� metodi antaa yhden lvl:n lis�� hahmolle ja p�ivitt�� samalla maxHp:n ja seuraavaan lvl:een tarvittavan Xp:n
	 */
	public void kehity() {
		lvl += 1;
		maxXp += 250;
		maxHp += 5;
	}
	
	/**
	 * T�m� metodi kuluttaa hahmolta parametrina saadun arvon verran rahaa.
	 * @param x kulutettava m��r�.
	 */
	public void kulutaRahaa(int x) {
		rahat -= x;
	}
	
	/**
	 * T�m� metodi mahdollistaa hahmon luonnin ilman k�ytt�j��n sy�tteit�.
	 * @param n hahmon nimi.
	 * @param l hahmon lvl
	 * @param h hahmon hp
	 * @param r hahmon rotu
	 * @param lu hahmon luokka
	 */
	public void luoHahmo(String n, int l, int h, Tyyppi r, Tyyppi lu) {
		nimi = n;
		lvl = l;
		hp = h;
		maxHp = h;
		rotu = r;
		luokka = lu;
		att = r.getAtt() + lu.getAtt();
		spe = r.getSpe() + lu.getSpe();
		def = r.getDef() + lu.getDef();
		iskut[1] = r.getIsku();
		iskut[2] = lu.getIsku();
	}
	
	/**
	 * T�m� metodi v�hent�� hahmon hp pisteit� parametrina saadun arvon verran
	 * @param vahinko otettava vahinko
	 */
	public void otaVahinkoa(int vahinko) {
		if(vahinko > hp) {
			hp = 0;
		} else {
			hp = hp - vahinko;
		}
	}
	
	/**
	 * T�m� metodi lis�� hahmon Hp pisteit� parametrin� saadun arvon verran.
	 * Ei kuitenkaan anna hp arvon kasvaa suuremmaksi kuin maxHp
	 * @param parannus parannettava m��r�
	 */
	public void paranna(int parannus) {
		if (hp + parannus > maxHp) {
			hp = maxHp; 
		} else {
			hp = hp + parannus;
		}
	}
	
	/**
	 * T�m� metodi antaa hahmolle rahaa parametrina saadun arvon verran.
	 * @param x annettava raham��r�
	 */
	public void saaRahaa(int x) {
		rahat += x;
	}
	
	/**
	 * T�m� metodi antaa hahmolle parametrina saadun arvon verran xp pisteit�.
	 * Jos xp pisteet kasvaa suuremmaksi kuin maxXp kehitt�� metodi hahmoa levelill�,
	 * ja asettaa xp arvoksi ylij��m�n.
	 * @param x annettava xp-m��r�
	 */
	public void saaXp(int x) {
		xp = xp + x;
		
		while(true) {
			if(xp > maxXp) {
				this.kehity();
				xp = xp - maxXp;
			} else {
				break;
			}
		}
	}
	
	private void tulosta(String lause) {
		System.out.println(lause);
	}
	
	/**
	 * T�m� metodi tulostaa hahmon ja sen m��ritellyt arvot nimi,hp,maxhp,lvl,rotu,luokka,att,spe,def.
	 */
	public void tulostaHahmo() {
		tulosta("============================================\n");
		tulosta("Nimi: " + nimi);
		tulosta("Hp: " + hp + "/" + maxHp);
		tulosta("Lvl: " + lvl + "   " + xp + "/" + (maxXp));
		tulosta("Rotu: " + rotu.getNimi());
		tulosta("Luokka: " + luokka.getNimi());
		tulosta("Hy�kk�ys: " + att);
		tulosta("Nopeus: " + spe);
		tulosta("Puolustus: " + def);
		tulosta("============================================\n");
	}
	
	/**
	 * T�m� metodi tulostaa hahmon kaikkien kolmen iskun nimet.
	 */
	public void tulostaIskuNimet() {
		for(int i = 0; i < 3; i ++) {
			tulosta("(" + (i+1) + ") " + iskut[i].getNimi());
		}
	}
	
	/**
	 * T�m� metodit tulostaa kaikki hahmon kolme iskua ja niiden tilastot
	 */
	public void tulostaIskut() {
		for(int i = 0; i < iskut.length; i ++) {
			tulosta(iskut[i].toString());
		}
	}
	
	/**
	 * t�m� metodi tulostaa hahmon nimen ja hp:n
	 */
	public void tulostaNimiHp() {
		tulosta(nimi + " " + hp + "/" + maxHp);
	}
	
	
	/**
	 * T�m� metodi antaa k�ytt�j�n valita hahmolle luokan.
	 * Metodi tulostaa vaihtoehdot n�yt�lle, jonka j�lkeen k�ytt�j� valitsee haluamansa luokan.
	 * Painamalla 10 k�ytt�j� saa tulostettua n�yt�lle my�s luokkien tiedot
	 * @param luokat luokat sis�lt�v� lista
	 * @throws FileNotFoundException
	 */
	public void valitseLuokka(Lista luokat) throws FileNotFoundException {

		while(this.luokka == null) {
			tulosta("============================================\n");
			tulosta("Valitse luokka");
			for(int i = 0; i < luokat.getLista().size(); i ++) {
				tulosta("(" + (i+1) + ") " + luokat.getLista().get(i).getNimi());
			}
			tulosta("(10) Tulosta luokkatiedot");
			int valinta = Integer.parseInt(lukija.nextLine());
			if(valinta > 0 && valinta <= luokat.getLista().size()) {
				luokka = luokat.getLista().get(valinta - 1);
				att += luokat.getLista().get(valinta - 1).getAtt();
				spe += luokat.getLista().get(valinta - 1).getSpe();
				def += luokat.getLista().get(valinta - 1).getDef();
				iskut[2] = luokat.getLista().get(valinta - 1).getIsku();
			} else if(valinta == 10) {
				for(int i = 0; i < luokat.getLista().size(); i ++) {
					luokat.getLista().get(i).tulostaTiedot();
				}
			} else {
				tulosta("virheellinen sy�te");
			}
		}
		tulosta("============================================\n");
	}
	
	/**
	 * T�m� metodi asettaa hahmon nimeksi k�ytt�j�n antaman sy�tteen.
	 */
	public void valitseNimi() {
		tulosta("============================================\n");
		tulosta("Nime� hahmo: ");
		this.nimi = lukija.nextLine();
		tulosta("============================================\n");
	}
	
	
	/**
	 * T�m� metodi antaa k�ytt�j�n valita hahmolle rodun.
	 * Metodi tulostaa vaihtoehdot n�yt�lle, jonka j�lkeen k�ytt�j� valitsee haluamansa rodun.
	 * Painamalla 10 k�ytt�j� saa tulostettua n�yt�lle my�s rotujen tiedot
	 * @param rodut Rodut sis�lt�v� lista
	 * @throws FileNotFoundException
	 */
	public void valitseRotu(Lista rodut) throws FileNotFoundException {
		
		while(this.rotu == null) {
			tulosta("============================================\n");
			tulosta("Valitse rotu");
			for(int i = 0; i < rodut.getLista().size(); i ++) {
				tulosta("(" + (i+1) + ") " + rodut.getLista().get(i).getNimi());
			}
			tulosta("(10) Tulosta rotutiedot");
			int valinta = Integer.parseInt(lukija.nextLine());
			if(valinta > 0 && valinta <= rodut.getLista().size()) {
				rotu = rodut.getLista().get(valinta - 1);
				att += rodut.getLista().get(valinta - 1).getAtt();
				spe += rodut.getLista().get(valinta - 1).getSpe();
				def += rodut.getLista().get(valinta - 1).getDef();
				iskut[1] = rodut.getLista().get(valinta - 1).getIsku();
			} else if(valinta == 10) {
				for(int i = 0; i < rodut.getLista().size(); i ++) {
					rodut.getLista().get(i).tulostaTiedot();
				}
			} else {
				tulosta("virheellinen sy�te");
			}
		}
		tulosta("============================================\n");
	}
	
	
}
