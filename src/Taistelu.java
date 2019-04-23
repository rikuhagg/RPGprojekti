import java.util.*;
import java.io.*;

/**
 * Taistelu -luokka kuvaa k‰yt‰v‰‰ kahden Hahmon v‰list‰ taistelua. 
 * @author Riku
 *
 */
public class Taistelu {
	private Hahmo p;
	private Hahmo v;
	private Scanner lukija;
	private Random rand;
	
	/**
	 * T‰m‰ konstruktori luo uuden taistelutilanteen parametrin‰ annettujen hahmojen v‰lille.
	 * Taistelu koostuu kierroksista ja joka kierroksen alussa k‰ytt‰j‰ valitsee haluamansa iskun ja tietokone arpoo iskun.
	 * T‰m‰n j‰lkeen ohjelma tarkastaa kumman hahmon nopeus on suurempi, jolloin nopeampi hahmo saa aloittaa iskemisen.
	 * Jos molempien isketty‰  molemmat hahmot ovat viel‰ hengiss‰ aloitetaan kierros alusta.
	 * @param p K‰ytt‰j‰n ohjaama hahmo
	 * @param v tietokoneen ohjaama hahmo
	 */
	public Taistelu(Hahmo p, Hahmo v)  {
		this.p = p;
		this.v = v;
		lukija = new Scanner(System.in);
		rand = new Random();
		
		while(p.getHp() > 0 && v.getHp() > 0) {
			tulosta("\n============================================\n");
			v.tulostaNimiHp();
			tulosta("");
			p.tulostaNimiHp();
			p.tulostaIskuNimet();
			tulosta("\nValitse isku: ");
			
			String valinta;
			int pIsku = 0;
			int i = 0;
			while(i == 0) {
				valinta = lukija.nextLine();
				if(valinta.equals("1") || valinta.equals("2") || valinta.equals("3")) {
					pIsku = Integer.parseInt(valinta) - 1;
					i = 1;
				} else {
					tulosta(valinta + " on hyv‰ valinta, mutta valitseppa joku toinen, niinku vaikka 1, 2 tai 3");
				}
			}
			
			int vIsku = rand.nextInt(3);
			
			if(checkSpe(p.getIsku(pIsku),v.getIsku(vIsku))) {
				pHyokkaa(pIsku);
				
				if(v.getHp() > 0) {
					vHyokkaa(vIsku);
					
				}
			} else {
				vHyokkaa(vIsku);
				if(p.getHp() > 0) {
					pHyokkaa(pIsku);
				}
			}
			tulosta("============================================\n");
		}
		if(v.getHp() == 0) {
			voitto();
		} else {
			tulosta("H‰visit taistelun");
		}
	}
			
	/**
	 * T‰m‰ metodi tarkastaa kumman hahmon isku nopeus arvo on suurempi ja palauttaa true jos pIsku parametrin arvo on suurempi.
	 * @param pIsku k‰ytt‰j‰n valitsema isku
	 * @param vIsku tietokoneen ohjaaman hahmon arpoma isku
	 * @return palauttaa true tai false
	 */
	public boolean checkSpe(Isku pIsku, Isku vIsku) {
		if((pIsku.getSpe() + p.getSpe()) >= (vIsku.getSpe() + v.getSpe())) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * T‰m‰ metodi antaa pelaajan ohjaaman hahmon hyˆk‰t‰ vastustajan kimppuun parametrin‰ saadulla iskulla.
	 * @param i isku jolla hahmo hyˆkk‰‰
	 */
	public void pHyokkaa(int i) {
		tulosta("K‰ytit iskun: " + p.getIsku(i).getNimi());
		if((rand.nextInt(19) + p.getIsku(i).getAcc()) >= 10) {
			int bonus = 0;
			if(v.getRotu().equals(p.getIsku(i).getHeikkous())) {
				bonus -= 2;
			} 
			if(v.getRotu().equals(p.getIsku(i).getVahvuus())) {
				bonus += 2;
			}
			v.otaVahinkoa(p.getLvl()+p.getAtt()+p.getIsku(i).getAtt() + bonus - (v.getDef()));
			
			v.tulostaNimiHp();
		} else {
			tulosta("Ohi meni!");
		}
	}
	
	/**
	 * T‰m‰ metodi antaa tietokoneen ohjaaman hahmon hyˆk‰t‰ pelaajan hahmoa vastaan parametrin‰ saadulla iskulla
	 * @param i isku jolla hahmo hyˆkk‰‰
	 */
	public void vHyokkaa(int i) {
		tulosta("Vastustaja k‰ytti iskun: " + v.getIsku(i).getNimi());
		if((rand.nextInt(19) + v.getIsku(i).getAcc()) >= 10) {
			int bonus = 0;
			if(p.getRotu().equals(v.getIsku(i).getHeikkous())) {
				bonus -= 2;
			} 
			if(p.getRotu().equals(v.getIsku(i).getVahvuus())) {
				bonus += 2;
			}
			p.otaVahinkoa(v.getLvl()+v.getAtt()+v.getIsku(i).getAtt() + bonus -(p.getDef()));
			
			p.tulostaNimiHp();
		} else {
			tulosta("Ohi meni!");
		}
	}
	
	/**
	 * T‰m‰ metodi antaa pelaajn hahmon voittaessa hahmolle satunnaisen m‰‰r‰n xp-pisteit‰ ja rahaa
	 */
	public void voitto() {
		tulosta("VOITIT!");
		int xp = rand.nextInt(100) + 100 +((v.getLvl()) * 50);
		p.saaXp(xp);
		int raha = rand.nextInt(50)+ 25 + (v.getLvl() * 27);
		p.saaRahaa(raha);
		p.paranna(p.getMaxHp());
		tulosta("Sait " + xp + "XP ja " + raha + " Kultakolikkoa");
		tulosta("\n============================================\n");
		
	}
	
	private void tulosta(String lause) {
		System.out.println(lause);
	}
	
	
	
}
