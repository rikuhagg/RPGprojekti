
import java.util.*;
import java.io.*;

public class Peli {

	final static Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> tarina = lueTiedosto("tarina.txt");

		tulosta("Aloita peli painamalla ENTER");
		String testaa = lukija.nextLine();
		switch (testaa) {
		
			case "testaa":
				int x = 0;
				while(x == 0) {
					tulosta("(1) Avaa Lootbox");
					tulosta("(2) Luo Hahmo");
					tulosta("(10) Lopeta");
					String test = lukija.nextLine();
			
					switch(test) {
						case"1":
							LootBox box = new LootBox("esineet.txt");
							box.arvoBoxi();
							box.tulostaBoxi();
							break;
						case"2":
							Hahmo testi = new Hahmo();
							testi.valitseRotu(getRodut());
							testi.valitseLuokka(getLuokat());
							testi.valitseNimi();
							break;
						case"10":
							x = 1;
							break;
				}
			}
			break;
		
			
		default:

			Hahmo hahmo = new Hahmo();

			// nimenvalinta

			int edistys = 0;
			while (edistys < 10) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 26) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 34) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 38) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			hahmo.valitseNimi();
			tarina = korvaaTarinasta(tarina, ";", hahmo.getNimi());

			// rodunvalinta
			edistys = 40;
			while (edistys < 48) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 50) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			hahmo.valitseRotu(getRodut());

			switch (hahmo.getRotu()) {
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
			edistys++;
			tulosta(tarina.get(edistys));
			edistys++;
			tulosta(tarina.get(edistys));

			// luokanvalinta

			edistys = 65;
			while (edistys < 68) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			hahmo.valitseLuokka(getLuokat());
			String ase = "";
			switch (hahmo.getLuokka()) {
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
			tarina = korvaaTarinasta(tarina, "#", ase);

			tulosta(tarina.get(edistys));
			edistys++;
			tulosta(tarina.get(edistys));
			edistys++;
			tulosta(tarina.get(edistys));

			edistys = 81;
			tulosta(tarina.get(edistys));
			edistys++;
			lukija.nextLine();

			while (edistys < 91) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 115) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 119) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 123) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			tulosta(tarina.get(124));
			tulosta(tarina.get(128));
			tulosta(tarina.get(131));

			int k = 0;
			while (k == 0) {
				String valinta = valitse();
				switch (valinta) {
				case "1":
					tulosta(tarina.get(125));
					tulosta(tarina.get(126));
					k = 1;
					break;
				case "2":
					tulosta(tarina.get(129));
					k = 1;
					break;
				case "3":
					tulosta(tarina.get(132));
					k = 1;
					break;
				default:
					tulosta("Virheellinen valinta");
				}// switch
			} // while

			edistys = 133;

			while (edistys < 138) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 142) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 147) {
				tulosta(tarina.get(edistys));
				edistys++;
			}
			lukija.nextLine();

			while (edistys < 150) {
				tulosta(tarina.get(edistys));
				edistys++;
			}

			lukija.nextLine();
			Hahmo soturi1 = new Hahmo();
			soturi1.luoHahmo("Helevurnen sotilas", 0, 15, getRodut().getLista().get(2), getLuokat().getLista().get(2));
			soturi1.kehita(-2, -2, -2);
			Taistelu tst = new Taistelu(hahmo, soturi1);
		}
	
	}

	/**
	 * Tämä metodi palauttaa luokkia sisältävän listan
	 * 
	 * @return luokat nimisen listan
	 * @throws FileNotFoundException
	 */
	public static Lista getLuokat() throws FileNotFoundException {
		Lista luokat = new Lista("Rodut.txt");
		return luokat;
	}

	/**
	 * Tämä metodi palauttaa rotuja sisältävän listan
	 * 
	 * @return rodut nimisen listan
	 * @throws FileNotFoundException
	 */
	public static Lista getRodut() throws FileNotFoundException {
		Lista rodut = new Lista("Rodut.txt");
		return rodut;
	}

	/**
	 * Tämä metodin tarkoitus on valittu sana joka listan kohdassa halutulla
	 * korvikkeella
	 * 
	 * @param tarina
	 *            läpikäytävä lista
	 * @param a
	 *            korvattava sana/merkki
	 * @param b
	 *            korvike
	 * @return palauttaa korvatun listan
	 */
	public static ArrayList<String> korvaaTarinasta(ArrayList<String> tarina, String a, String b) {
		ArrayList<String> korvattu = new ArrayList<>();

		for (int i = 0; i < tarina.size(); i++) {
			korvattu.add(tarina.get(i).replaceAll(a, b));
		}
		return korvattu;
	}

	/**
	 * Tämä metodi lukee tiedostosta rivejä ja tallentaa ne ArrayList-tyyppiseen
	 * muuttujaan.
	 * 
	 * @param tiedosto
	 *            luettavan tiedoston nimi.
	 * @return palauttaa tiedoston sisällön listana.
	 * @throws FileNotFoundException
	 */
	public static ArrayList<String> lueTiedosto(String tiedosto) throws FileNotFoundException {
		Scanner l = new Scanner(new File(tiedosto));
		ArrayList<String> tarina = new ArrayList<>();
		while (l.hasNext()) {
			tarina.add(l.nextLine());
		}
		l.close();
		return tarina;
	}

	/**
	 * Tämä metodi tulostaa näytölle halutun lauseen.
	 * 
	 * @param lause
	 *            tulostettava lause
	 */
	public static void tulosta(String lause) {
		System.out.println(lause);
	}

	/**
	 * Tämän metodin avulla suoritetaan valinta.
	 * 
	 * @return palauttaa valinnan arvon.
	 */
	public static String valitse() {
		tulosta("\n============================================\n");
		tulosta("Tee valinta: ");
		String valinta = lukija.nextLine();
		tulosta("\n============================================\n");
		return valinta;
	}

}
