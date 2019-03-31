
import java.io.File;
import java.util.*;
import java.io.*;

public class Lista {
	private ArrayList<Rotu> rodut;
	private ArrayList<Luokka> luokat;
	
	
	
	public Lista()  {
		this.rodut= new ArrayList<>();
		this.luokat = new ArrayList<>();
		
	}
	
	
	public void luoRotuLista(String tiedosto) throws FileNotFoundException {
		Scanner lukija = new Scanner(new File(tiedosto));
		ArrayList<String> rot = new ArrayList<>();
		while(lukija.hasNext()) {
			rot.add(lukija.nextLine());
		}
		lukija.close();
		System.out.println(rot.get(0));
		
		try {
			rot.stream()
				.map(rivi -> rivi.split(";"))
				.map(palat -> new Rotu(palat[0],Integer.parseInt(palat[1]),Integer.parseInt(palat[2]),Integer.parseInt(palat[3])))
				.forEach(rotu -> rodut.add(rotu));		
		} catch (Exception e) {
			
		}
	}
	
	public void luoLuokkaLista(String tiedosto) throws FileNotFoundException {
		Scanner lukija = new Scanner(new File(tiedosto));
		ArrayList<String> luok = new ArrayList<>();
		while(lukija.hasNext()) {
			luok.add(lukija.nextLine());
		}
		lukija.close();
		System.out.println(luok.get(0));
		
		try {
			luok.stream()
				.map(rivi -> rivi.split(";"))
				.map(palat -> new Luokka(palat[0],Integer.parseInt(palat[1]),Integer.parseInt(palat[2]),Integer.parseInt(palat[3])))
				.forEach(luokka -> luokat.add(luokka));		
		} catch (Exception e) {
			
		}
	}
	
	
	public ArrayList<Rotu> rodut() {
		return rodut;
	}
	
	public ArrayList<Luokka> luokat() {
		return luokat;
	}
	
}
