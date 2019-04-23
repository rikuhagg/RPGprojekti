import java.util.*;
import java.io.*;

/**
 * Tämä Luokka kuvaa lootbocia, joka arpoo käyttäjälle kolme satunnaista esinettä.
 * @author Riku
 *
 */
public class LootBox {
	public ArrayList<Esine> esineet;
	public Random r;
	Esine[] arvotut;
	
	/**
	 * Tämä konstruktori luo uuden esine-tyyppisen listan parametrinä annetun tiedoston sisällöstä.
	 * @param tiedosto tiedosto, josta lista luodaan.
	 * @throws FileNotFoundException
	 */
	public LootBox(String tiedosto) throws FileNotFoundException {
		this.esineet = new ArrayList<>();
		this.r = new Random();
		this.arvotut = new Esine[3];
		
		Scanner lukija = new Scanner(new File(tiedosto));
		ArrayList<String> rivit = new ArrayList<>();
		while(lukija.hasNext()) {
			rivit.add(lukija.nextLine());
		}
		lukija.close();
		
		try {
			rivit.stream()
				.map(rivi -> rivi.split(";"))
				.map(palat -> new Esine(palat[0],Integer.parseInt(palat[1]),Integer.parseInt(palat[2]),Integer.parseInt(palat[3])))
				.forEach(esine -> esineet.add(esine));		
		} catch (Exception e) {
			
		}
	}
	
	/**
	 * Tämä metodi sekoittaa ja arpoo konstruktorissa luodusta listasta kolme esinettä ja tallentaa ne omaan taulukkoon.
	 */
	public void arvoBoxi() {
		Collections.shuffle(esineet);
		arvotut[0] = esineet.get(r.nextInt(500));
		arvotut[1] = esineet.get(r.nextInt(500));
		arvotut[2] = esineet.get(r.nextInt(500));
	}
	
	/**
	 * Tämä metodi palauttaa taulukosta parametrinä annetun esineen tiedot
	 * @param i halatun esineen indeksi
	 * @return haluttu esine
	 */
	public Esine getEsine(int i) {
		return arvotut[i];
	}
	
	/**
	 * Tämä metodi tulostaa näytölle arvotut esineet.
	 */
	public void tulostaBoxi() {
		tulosta("\n============================================\n");
		tulosta("Onneksi Olkoon! Voitit seuraavat esineet: \n");
		arvotut[0].tulostaEsine();
		arvotut[1].tulostaEsine();
		arvotut[2].tulostaEsine();
		tulosta("\n============================================\n");
	}
	
	private void tulosta(String lause) {
		System.out.println(lause);
	}
}
