

import java.util.*;	
import java.io.*;

public class Peli {
	
	final static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		
		Lista listat = new Lista();
		listat.luoRotuLista("rodut.txt");
		listat.luoLuokkaLista("luokat.txt");
		
		
		
		
		
		Rotu rotu = null;
		while(rotu == null) {
			tulosta("=========================\n");
			tulosta("Valitse rotu");
			for(int i = 0; i < listat.rodut().size(); i ++) {
				tulosta("(" + (i+1) + ") " + listat.rodut().get(i).returnNimi());
			}
			tulosta("(10) Tulosta rotutiedot");
			int valinta = Integer.parseInt(lukija.nextLine());
			if(valinta > 0 && valinta <= listat.rodut().size()) {
				rotu = listat.rodut().get(valinta - 1);
			} else if(valinta == 10) {
				for(int i = 0; i < listat.rodut().size(); i ++) {
					listat.rodut().get(i).tulostaTiedot();
				}
			} else {
				tulosta("virheellinen syöte");
			}
			
			
		}
		
		Luokka luokka = null;
		while(luokka == null) {
			tulosta("=========================\n");
			tulosta("Valitse Luokka");
					for(int i = 0; i < listat.luokat().size(); i ++) {
					tulosta("(" + (i+1) + ") " + listat.luokat().get(i).returnNimi());
					
				}
				tulosta("(10) Tulosta Luokkatiedot");
				int valinta = Integer.parseInt(lukija.nextLine());
				if(valinta > 0 && valinta <= listat.luokat().size()) {
					luokka = listat.luokat().get(valinta - 1);
				} else if(valinta == 10) {
					for(int i = 0; i < listat.luokat().size(); i ++) {
						listat.luokat().get(i).tulostaTiedot();
					}
				} else {
					tulosta("virheellinen syöte");
				}
				
	
		}
		tulosta("=========================\n");
		tulosta("Valitse nimi: ");
		
		String nimi = lukija.nextLine();
		
		Hahmo hahmo = new Hahmo(nimi, rotu, luokka);
		hahmo.tulostaHahmo();
		
		int i = 0;
		
		while(i == 0) {
			tulosta("\n=========================\n");
			tulosta("(1) Kehitä voimaa");
			tulosta("(2) Kehitä nopeutta");
			tulosta("(3) Kehitä taikaa");
			tulosta("(9) Tulosta hahmontiedot");
			tulosta("(69) lopeta");
			
		
			String x = lukija.next();
			switch (x) {
				case "1":
					hahmo.kehitaVoimaa(1);
					break;
				case "2":
					hahmo.kehitaNopeutta(1);
					break;
				case "3":
					hahmo.kehitaTaikaa(1);
					break;
				case "9":
					hahmo.tulostaHahmo();
					break;
				case "69":
					i = 1;
					break;
				default:
					tulosta("Virheellinen syöte");
			}
		}

	}
	
	public static void tulosta(String lause) {
		System.out.println(lause);
	}
	

}
