
import java.io.File;
import java.util.*;
import java.io.*;

/**
 * Lista luokan tarkoitus on lukea rivejä tiedostosta ja muokata ne tyyppi -tyyppiseksi listaksi
 * @author Riku
 *
 */
public class Lista {
	private ArrayList<Tyyppi> lista;
	
	
	/**
	 * Tämä konstruktori lukee parametrinä annetusta tiedostosta rivejä ja muokkaa ne tyyppi-tyyppisiksi muuttujiksi ja tallentaa ne yhdeksi listaksi.
	 * @param tiedosto luettava tiedosto
	 * @throws FileNotFoundException
	 */
	public Lista(String tiedosto) throws FileNotFoundException  {
		this.lista = new ArrayList<>();
		
		Scanner lukija = new Scanner(new File(tiedosto));
		ArrayList<String> rivit = new ArrayList<>();
		while(lukija.hasNext()) {
			rivit.add(lukija.nextLine());
		}
		lukija.close();
		
		try {
			rivit.stream()
				.map(rivi -> rivi.split(";"))
				.map(palat -> new Tyyppi(palat[0],palat[1],Integer.parseInt(palat[2]),Integer.parseInt(palat[3]),Integer.parseInt(palat[4]),palat[5],Integer.parseInt(palat[6]),Integer.parseInt(palat[7]),Integer.parseInt(palat[8]),palat[9],palat[10]))
				.forEach(rotu -> lista.add(rotu));		
		} catch (Exception e) {
			
		}
		
	}
	
	/**
	 * Tämä metodi palauttaa luodun listan
	 * @return palauttaa listan
	 */
	public ArrayList<Tyyppi> getLista() {
		return lista;
	}
}
