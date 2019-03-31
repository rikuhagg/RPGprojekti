import java.util.*;

public class Hahmo {
	private String nimi;
	private int voima;
	private int nopeus;
	private int taika;
	private int puolustus;
	private int hyökkäys;
	private int hp;
	private Esine[] esineet;
	private Luokka luokka;
	private Rotu rotu;
	
	
	public Hahmo(String nimi, Rotu rotu, Luokka luokka) {
		this.nimi = nimi;
		this.luokka = luokka;
		this.rotu = rotu;
		this.voima = 0 + this.rotu.returnVoima() + this.luokka.returnVoima();
		this.nopeus = 0 + this.rotu.returnNopeus() + this.luokka.returnNopeus();
		this.taika = 0 + this.rotu.returnTaika() + this. luokka.returnTaika();
		this.esineet = new Esine[5];
		
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
	
	public void kehitaTaikaa(int x) {
		taika += x;
	}
	
	public void kehitaNopeutta(int x) {
		nopeus += x;
	}
		
	
	public void tulosta(String lause) {
		System.out.println(lause);
	}
	
}
