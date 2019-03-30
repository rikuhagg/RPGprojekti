import java.util.*;
public class main {

	public static void main(String[] args) {
		
		
		
		Rotu kaapio = new Rotu("Kääpiö", 3, 1, 2);
		Rotu haltia = new Rotu("Haltia", 1, 3, 2);
		Luokka maagi = new Luokka("Maagi", 0, 0, 2);
		Luokka varas = new Luokka("Varas", 0, 2, 0);
		
		tulosta("Luo hahmo");
		Rotu rotu = null;
		while(rotu == null) {
			tulosta("Valitse rotu");
			tulosta("(1) Kääpiö");
			tulosta("(2) Haltia");
			tulosta("(9) Tulosta rotutiedot");
			
			int syote = Integer.parseInt(lukija.nextLine());
			
			switch(syote) {
				case 1:
					rotu = kaapio;
					tulosta("\n=========================\n");
					break;
				case 2:
					rotu = haltia;
					tulosta("\n=========================\n");
					break;
				case 9:
					kaapio.tulostaTiedot();
					haltia.tulostaTiedot();
					break;
				default:
					tulosta("Virheellinen syöte");
			}
		}
			
		Luokka luokka = null;
		while(luokka == null) {
			
			tulosta("Valitse luokka");
			tulosta("(1) Maagi");
			tulosta("(2) Varas");
			tulosta("(9) Tulosta luokkatiedot");
			
			int syote2 = Integer.parseInt(lukija.nextLine());
			
			switch(syote2) {
				case 1:
					luokka = maagi;;
					tulosta("\n=========================\n");
					break;
				case 2:
					luokka = varas;
					tulosta("\n=========================\n");
					break;
				case 9:
					maagi.tulostaTiedot();
					varas.tulostaTiedot();
					break;
				default:
					tulosta("Virheellinen syöte");
			}
		}
		
		tulosta("Valitse nimi: ");
		String nimi = lukija.nextLine();
		
		Hahmo hahmo = new Hahmo(nimi, rotu, luokka);
		hahmo.tulostaHahmo();
		
		int i = 0;
		
		while(i == 0) {
			tulosta("(1) Kehitä voimaa");
			tulosta("(2) Kehitä nopeutta");
			tulosta("(3) Kehitä taikaa");
			tulosta("(9) Tulosta hahmontiedot ja lopeta");
			tulosta("(69) Lopeta");
		
			int x = Integer.parseInt(lukija.nextLine());
			switch (x) {
				case 1:
					hahmo.kehitaVoimaa(1);
					break;
				case 2:
					hahmo.kehitaNopeutta(1);
					break;
				case 3:
					hahmo.kehitaTaikaa(x);
					break;
				case 9:
					hahmo.tulostaHahmo();
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
	
	public static final Scanner lukija = new Scanner(System.in);

}
