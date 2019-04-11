import java.util.*;
import java.io.*;

public class LootBox {
	public ArrayList<Esine> esineet;
	public Random r;
	Esine[] arvotut;
	
	
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
	
	public void arvoBoxi() {
		Collections.shuffle(esineet);
		arvotut[0] = esineet.get(r.nextInt(500));
		arvotut[1] = esineet.get(r.nextInt(500));
		arvotut[2] = esineet.get(r.nextInt(500));
	}
	
	public void tulostaBoxi() {
		tulosta("\n============================================\n");
		tulosta("Onneksi Olkoon! Voitit seuraavat esineet: \n");
		arvotut[0].tulostaEsine();
		arvotut[1].tulostaEsine();
		arvotut[2].tulostaEsine();
		tulosta("\n============================================\n");
	}
	
	public Esine palautaEsine(int i) {
		return arvotut[i];
	}
	
	
	private void tulosta(String lause) {
		System.out.println(lause);
	}
}
