

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
			tulosta("(1) Kehitä voimaa");
			tulosta("(2) Kehitä nopeutta");
			tulosta("(3) Kehitä taikaa");
			tulosta("(4) Avaa LootBox");
			tulosta("(10) Tulosta hahmontiedot");
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
				case "4":
					LootBox box = new LootBox("Esineet.txt");
					box.arvoBoxi();
					box.tulostaBoxi();
					for(int k = 0; k < 3; k ++) {
						hahmo.kehitaVoimaa(box.palautaEsine(i).voima());
						hahmo.kehitaNopeutta(box.palautaEsine(i).nopeus());
						hahmo.kehitaTaikaa(box.palautaEsine(i).taika());
					}
 					break;
 					
				case "10":
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
