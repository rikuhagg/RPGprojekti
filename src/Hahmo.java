import java.util.*;
import java.io.*;

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
	
	
	public Hahmo() {
		this.lukija = new Scanner(System.in);
		this.nimi = null;
		this.luokka = null;
		this.rotu = null;
		this.att = 0;
		this.spe = 0;
		this.def = 0;
		this.hp = 10;
		this.maxHp = 10;
		this.lvl = 1;
		this.xp = 0;
		this. maxXp = 1000;
		this.kokemus = 0;
		this.esineet = new Esine[5];
		this.iskut = new Isku[4];
		
	}
	
	public void valitseRotu(String tiedosto) throws FileNotFoundException {
		Lista rodut = new Lista(tiedosto);
		
		while(this.rotu == null) {
			tulosta("============================================\n");
			tulosta("Valitse rotu");
			for(int i = 0; i < rodut.returnLista().size(); i ++) {
				tulosta("(" + (i+1) + ") " + rodut.returnLista().get(i).getNimi());
			}
			tulosta("(10) Tulosta rotutiedot");
			int valinta = Integer.parseInt(lukija.nextLine());
			if(valinta > 0 && valinta <= rodut.returnLista().size()) {
				rotu = rodut.returnLista().get(valinta - 1);
				att += rodut.returnLista().get(valinta - 1).getAtt();
				spe += rodut.returnLista().get(valinta - 1).getSpe();
				def += rodut.returnLista().get(valinta - 1).getDef();
			} else if(valinta == 10) {
				for(int i = 0; i < rodut.returnLista().size(); i ++) {
					rodut.returnLista().get(i).tulostaTiedot();
				}
			} else {
				tulosta("virheellinen syöte");
			}
		}
		tulosta("============================================\n");
	}
	
	public void luoAuto() {
		rotu = new Tyyppi("Rotu","Testi",1,1,1);
		luokka = new Tyyppi("Luokka","Testi",0,0,0);
		nimi = "Nimi";
		iskut[0] = new Isku("Lyönti", 2,2,2, "null","null");
		iskut[1] = new Isku("Potku", 3,3,3, "null","null");
		iskut[2] = new Isku("Pieru", 3,3,3, "null","null");
		iskut[3] = new Isku("Lyönti", 2,2,2, "testi","testi");
	}
	
	public void valitseLuokka(String tiedosto) throws FileNotFoundException {
		Lista luokat = new Lista(tiedosto);
		
		while(this.luokka == null) {
			tulosta("============================================\n");
			tulosta("Valitse luokka");
			for(int i = 0; i < luokat.returnLista().size(); i ++) {
				tulosta("(" + (i+1) + ") " + luokat.returnLista().get(i).getNimi());
			}
			tulosta("(10) Tulosta luokkatiedot");
			int valinta = Integer.parseInt(lukija.nextLine());
			if(valinta > 0 && valinta <= luokat.returnLista().size()) {
				luokka = luokat.returnLista().get(valinta - 1);
				att += luokat.returnLista().get(valinta - 1).getAtt();
				spe += luokat.returnLista().get(valinta - 1).getSpe();
				def += luokat.returnLista().get(valinta - 1).getDef();
			} else if(valinta == 10) {
				for(int i = 0; i < luokat.returnLista().size(); i ++) {
					luokat.returnLista().get(i).tulostaTiedot();
				}
			} else {
				tulosta("virheellinen syöte");
			}
		}
		tulosta("============================================\n");
	}
	
	public void valitseNimi() {
		tulosta("============================================\n");
		tulosta("Nimeä hahmo: ");
		this.nimi = lukija.nextLine();
		tulosta("============================================\n");
	}
	
	public void tulostaHahmo() {
		tulosta("============================================\n");
		tulosta("Nimi: " + nimi);
		tulosta("Hp: " + hp + "/" + maxHp);
		tulosta("Lvl: " + lvl + "   " + xp + "/" + (maxXp));
		tulosta("Rotu: " + rotu.getNimi());
		tulosta("Luokka: " + luokka.getNimi());
		tulosta("Hyökkäys: " + att);
		tulosta("Nopeus: " + spe);
		tulosta("Puolustus: " + def);
		tulosta("============================================\n");
	}
	
	
	public void kehity() {
		lvl += 1;
		maxXp += 250;
	}
	
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
	
	public void kehitaHyokkays(int x) {
		att += x;
	}
	
	public void kehitaPuolustus(int x) {
		def += x;
	}
	
	public void kehitaNopeus(int x) {
		spe += x;
	}
	
	public void kehitaHp(int x) {
		maxHp += x;
	}
	public String getRotu() {
		return rotu.getNimi();
	}
	
	public String getLuokka() {
		return luokka.getNimi();
	}
	
	public int getAtt() {
		return att;
	}
	
	public int getDef() {
		return def;
	}
	
	public int getSpe() {
		return spe;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getMaxHp() {
		return maxHp;
	}
	
	public int getRahat() {
		return rahat;
	}
	
	public void saaRahaa(int x) {
		rahat += x;
	}
	
	public void kulutaRahaa(int x) {
		rahat -= x;
	}
	
	public String getNimi() {
		return nimi;
	}
	
	public int getXp() {
		return xp;
	}
	
	public int getMaxXp() {
		return maxXp;
	}
	
	public int getLvl() {
		return lvl;
	}
	
	public void otaVahinkoa(int vahinko) {
		if(vahinko > hp) {
			hp = 0;
		} else {
			hp = hp - vahinko;
		}
	}
	
	public void paranna(int parannus) {
		if (hp + parannus > maxHp) {
			hp = maxHp; 
		} else {
			hp = hp + parannus;
		}
	}
	
	public void tulosta(String lause) {
		System.out.println(lause);
	}
	
	public Isku getIsku(int i) {
		return iskut[i];
	}
	
	public void tulostaIskut() {
		for(int i = 0; i < iskut.length; i ++) {
			tulosta(iskut[i].toString());
		}
	}
	
	public void tulostaIskuNimet() {
		for(int i = 0; i < 4; i ++) {
			tulosta("(" + (i+1) + ") " + iskut[i].getNimi());
		}
	}
	
	public void lisaaisku(Isku isku) {
		int i = 0;
		while(i < 4) {
			if(iskut[i] == null) {
				iskut[i] = isku;
				break;
			} else if(i == 3) {
				tulosta("Valitse korvattava isku:");
				for(int j = 0; j < 4; j ++) {
					tulosta("(" + (j+1) + ") " + iskut[j].getNimi());
					while(true) {
						int syote = lukija.nextInt();
						if(syote < 4 && syote >= 0) {
							iskut[syote - 1] = isku;
						} else {
							tulosta("Virheellinen syöte");
						}
					}
				}
			} else {
				i ++;
			}
		}
	}
	
	public void tulostaNimiHp() {
		tulosta(nimi + " " + hp + "/" + maxHp);
	}
	
}
