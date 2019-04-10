import java.util.*;
import java.io.*;

public class Hahmo {
	private Scanner lukija;
	private String nimi;
	private int voima;
	private int nopeus;
	private int taika;
	private int hp;
	private int maxHp;
	private int rahat;
	private Esine[] esineet;
	private Tyyppi luokka;
	private Tyyppi rotu;
	
	
	public Hahmo() {
		this.lukija = new Scanner(System.in);
		this.nimi = null;
		this.luokka = null;
		this.rotu = null;
		this.voima = 0;
		this.nopeus = 0;
		this.taika = 0;
		this.hp = 10;
		this.maxHp = 10;
		this.esineet = new Esine[5];
		
	}
	
	public void valitseRotu(String tiedosto) throws FileNotFoundException {
		Lista rodut = new Lista(tiedosto);
		
		while(this.rotu == null) {
			tulosta("=========================\n");
			tulosta("Valitse rotu");
			for(int i = 0; i < rodut.returnLista().size(); i ++) {
				tulosta("(" + (i+1) + ") " + rodut.returnLista().get(i).returnNimi());
			}
			tulosta("(10) Tulosta rotutiedot");
			int valinta = Integer.parseInt(lukija.nextLine());
			if(valinta > 0 && valinta <= rodut.returnLista().size()) {
				rotu = rodut.returnLista().get(valinta - 1);
				voima += rodut.returnLista().get(valinta - 1).returnVoima();
				nopeus += rodut.returnLista().get(valinta - 1).returnNopeus();
				taika += rodut.returnLista().get(valinta - 1).returnTaika();
			} else if(valinta == 10) {
				for(int i = 0; i < rodut.returnLista().size(); i ++) {
					rodut.returnLista().get(i).tulostaTiedot();
				}
			} else {
				tulosta("virheellinen syöte");
			}
		}
	}
	
	public void valitseLuokka(String tiedosto) throws FileNotFoundException {
		Lista luokat = new Lista(tiedosto);
		
		while(this.luokka == null) {
			tulosta("=========================\n");
			tulosta("Valitse luokka");
			for(int i = 0; i < luokat.returnLista().size(); i ++) {
				tulosta("(" + (i+1) + ") " + luokat.returnLista().get(i).returnNimi());
			}
			tulosta("(10) Tulosta luokkatiedot");
			int valinta = Integer.parseInt(lukija.nextLine());
			if(valinta > 0 && valinta <= luokat.returnLista().size()) {
				luokka = luokat.returnLista().get(valinta - 1);
				voima += luokat.returnLista().get(valinta - 1).returnVoima();
				nopeus += luokat.returnLista().get(valinta - 1).returnNopeus();
				taika += luokat.returnLista().get(valinta - 1).returnTaika();
			} else if(valinta == 10) {
				for(int i = 0; i < luokat.returnLista().size(); i ++) {
					luokat.returnLista().get(i).tulostaTiedot();
				}
			} else {
				tulosta("virheellinen syöte");
			}
		}
	}
	
	public void valitseNimi() {
		tulosta("=========================\n");
		tulosta("Nimeä hahmo: ");
		this.nimi = lukija.nextLine();
	}
	
	public void tulostaHahmo() {
		tulosta("=========================\n");
		tulosta("Nimi: " + nimi);
		tulosta("Rotu: " + rotu.returnNimi());
		tulosta("Luokka: " + luokka.returnNimi());
		tulosta("Voima: " + voima);
		tulosta("Nopeus: " + nopeus);
		tulosta("Taika: " + taika);
	}
	
	public void kehitaVoimaa(int x) {
		voima += x;
	}
	
	public int getVoima() {
		return voima;
	}
	
	public void kehitaTaikaa(int x) {
		taika += x;
	}
	
	public int getTaika() {
		return taika;
	}
	
	public void kehitaNopeutta(int x) {
		nopeus += x;
	}
	public String getRotu() {
		return rotu.returnNimi();
	}
	
	public String getLuokka() {
		return luokka.returnNimi();
	}
	
	public int getNopeus() {
		return nopeus;
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
	
	public void rahat(int x) {
	}
	
	public String getNimi() {
		return nimi;
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
	
	
}
