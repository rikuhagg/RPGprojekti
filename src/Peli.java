

import java.util.*;	
import java.io.*;

public class Peli {
	
	final static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Hahmo hahmo = new Hahmo();
		hahmo.valitseRotu("rodut.txt");
		hahmo.valitseLuokka("luokat.txt");
		hahmo.valitseNimi();
		
		
		
		hahmo.tulostaHahmo();
		
		int i = 0;
		
		while(i == 0) {
			tulosta("\n=========================\n");
			tulosta("(1) Kehit� voimaa");
			tulosta("(2) Kehit� nopeutta");
			tulosta("(3) Kehit� taikaa");
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
					tulosta("Virheellinen sy�te");
			}
		}

	}
	
	public static void tulosta(String lause) {
		System.out.println(lause);
	}
	

}
