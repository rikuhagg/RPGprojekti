

import java.util.*;	
import java.io.*;


public class Peli {
	
	final static Scanner lukija = new Scanner(System.in);
	

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> tarina = lueTiedosto("tarina.txt");
		
		tulosta("Aloita peli painamalla ENTER");
		String x = lukija.nextLine();
		switch (x) {
			case "testaa":
				tulosta("toimii");
				Hahmo testi = new Hahmo();
				testi.luoAuto();
				testi.tulostaHahmo();
				int j = 0;
				while(j == 0) {
				tulosta("1 anna XP \n"
						+ "2 tulosta hahmo \n"
						+ "3 avaa lootbox \n"
						+"4 taistele \n"
						+ "10 lopeta");
				String y = lukija.nextLine();
				switch(y) {
					case "1":
						tulosta("Lvl: " + testi.getLvl() + " " + testi.getXp() + "/" + testi.getMaxXp() 
						+ "\n Kuinka paljon Xp?");
						int z = lukija.nextInt();
						testi.saaXp(z);
						break;
					case "2":
						testi.tulostaHahmo();
						break;
					case "3":
						LootBox b = new LootBox("Esineet.txt");
						b.arvoBoxi();
						b.tulostaBoxi();
						break;
					case "4":
						Hahmo v = new Hahmo();
						v.luoAuto();
						Taistelu battle = new Taistelu(testi, v);
						battle.taistele();
						break;
					case"5":
						int k=0;
						while(k<tarina.size()) {
							tulosta(tarina.get(k));
							k ++;
						}
							
					case "10":
						j = 1;
						break;
					default:
						tulosta("väärä syöte");
				}
				}
				
				
				break;
				
				default:
				
				

		Hahmo hahmo = new Hahmo();
		
		//nimenvalinta
		
		int edistys = 0;
		while(edistys < 10) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		while(edistys < 26) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija .nextLine();
		
		while(edistys < 34) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		while(edistys < 38) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		hahmo.valitseNimi();
		tarina = korvaaTarinasta(tarina, ";", hahmo.getNimi());
		
		
		//rodunvalinta
		edistys = 40;
		while(edistys < 48) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		while(edistys < 50) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		hahmo.valitseRotu("rodut.txt");
		
		switch(hahmo.getRotu()) {
			case "Ihminen":
				edistys = 53;
				break;
			case "Haltija":
				edistys = 57;
				break;
			case "Jotun":
				edistys = 61;
				break;
		}
		
		tarina = korvaaTarinasta(tarina, "£", hahmo.getRotu().toLowerCase());
		
		tulosta(tarina.get(edistys));
		edistys ++;
		tulosta(tarina.get(edistys));
		edistys ++;
		tulosta(tarina.get(edistys));
		
		
		//luokanvalinta
		
		edistys = 65;
		while(edistys < 68) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		hahmo.valitseLuokka("luokat.txt");
		String ase = "";
		switch(hahmo.getLuokka()) {
		case "Soturi":
			edistys = 69;
			ase = "Miekka";
			break;
		case "Tarkka-ampuja":
			edistys = 73;
			ase = "Kivääri";
			break;
		case "Velho":
			edistys = 77;
			ase = "Sauva";
			break;
		}
		tarina = korvaaTarinasta(tarina,"#", ase);
		
		tulosta(tarina.get(edistys));
		edistys ++;
		tulosta(tarina.get(edistys));
		edistys ++;
		tulosta(tarina.get(edistys));
		tulosta(tarina.get(81));
		
		edistys = 82;
		while(edistys < 91) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		while(edistys < 115) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();

		
		while(edistys < 119) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		while(edistys < 123) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		tulosta(tarina.get(124));
		tulosta(tarina.get(128));
		tulosta(tarina.get(131));
		
		int k = 0;
		while(k == 0) {
			String valinta = valitse();
			switch(valinta) {
				case"1":
					tulosta(tarina.get(125));
					tulosta(tarina.get(126));
					k = 1;
					break;
				case"2":
					tulosta(tarina.get(129));
					k = 1;
					break;
				case"3":	
					tulosta(tarina.get(132));
					k = 1;
					break;
				default:
					tulosta("Virheellinen valinta");
			}//switch
		}//while
		
		edistys = 133;
		
		while(edistys < 138) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		while(edistys < 142) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		while(edistys < 147) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
		
		while(edistys < 152) {
			tulosta(tarina.get(edistys));
			edistys ++;
		}
		lukija.nextLine();
	}
}
	
	public static void tulosta(String lause) {
		System.out.println(lause);
	}
	
	public static String valitse() {
		tulosta("============================================\n");
		tulosta("Tee valinta: ");
		String valinta = lukija.nextLine();
		tulosta("============================================\n");
		return valinta;
	}
	
	public static ArrayList<String> lueTiedosto(String tiedosto) throws FileNotFoundException {
		Scanner l = new Scanner(new File(tiedosto));
		ArrayList<String> tarina = new ArrayList<>();
		while(l.hasNext()) {
			tarina.add(l.nextLine());
		}
		l.close();
		return tarina;
	}
	
	public static ArrayList<String> korvaaTarinasta(ArrayList<String> tarina, String a, String b) {
		ArrayList<String> korvattu = new ArrayList<>();
		
		for(int i = 0; i < tarina.size(); i ++) {
			korvattu.add(tarina.get(i).replaceAll(a,b));
		}
		return korvattu;
	}
	
}
