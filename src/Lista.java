
import java.io.File;
import java.util.*;
import java.io.*;

public class Lista {
	private ArrayList<Tyyppi> lista;
	private String tiedosto;
	
	
	
	public Lista(String tiedosto) throws FileNotFoundException  {
		this.lista = new ArrayList<>();
		this.tiedosto = tiedosto;
		
		Scanner lukija = new Scanner(new File(tiedosto));
		ArrayList<String> rivit = new ArrayList<>();
		while(lukija.hasNext()) {
			rivit.add(lukija.nextLine());
		}
		lukija.close();
		
		try {
			rivit.stream()
				.map(rivi -> rivi.split(";"))
				.map(palat -> new Tyyppi(palat[0],palat[1],Integer.parseInt(palat[2]),Integer.parseInt(palat[3]),Integer.parseInt(palat[4])))
				.forEach(rotu -> lista.add(rotu));		
		} catch (Exception e) {
			
		}
		
	}
	
	
	public ArrayList<Tyyppi> returnLista() {
		return lista;
	}
	
}
