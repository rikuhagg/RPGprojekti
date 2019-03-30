import java.util.*;
public class main {

	public static void main(String[] args) {
		
		
		
		Rotu kaapio = new Rotu("K��pi�", 3, 1, 2);
		Rotu haltia = new Rotu("Haltia", 1, 2, 3);
		Rotu ihminen = new Rotu("Ihminen", 2, 3, 1);
		Luokka velho = new Luokka("Velho", 0, 0, 2);
		Luokka varas = new Luokka("Varas", 0, 2, 0);
		Luokka soturi = new Luokka("Soturi", 2, 0, 0);
		
		tulosta("Luo hahmo");
		Rotu rotu = null;
		while(rotu == null) {
			tulosta("Valitse rotu");
			tulosta("(1) K��pi�");
			tulosta("(2) Haltia");
			tulosta("(3) Ihminen");
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
				case 3:
					rotu = ihminen;
					tulosta("\n=========================\n");
					break;
				case 9:
					kaapio.tulostaTiedot();
					haltia.tulostaTiedot();
					ihminen.tulostaTiedot();
					break;
				default:
					tulosta("Virheellinen sy�te");
			}
		}
			
		Luokka luokka = null;
		while(luokka == null) {
			
			tulosta("Valitse luokka");
			tulosta("(1) Velho");
			tulosta("(2) Varas");
			tulosta("(3) Soturi");
			tulosta("(9) Tulosta luokkatiedot");
			
			int syote2 = Integer.parseInt(lukija.nextLine());
			
			switch(syote2) {
				case 1:
					luokka = velho;;
					tulosta("\n=========================\n");
					break;
				case 2:
					luokka = varas;
					tulosta("\n=========================\n");
					break;
				case 3:
					luokka = soturi;
					tulosta("\n=========================\n");
					break;
				case 9:
					velho.tulostaTiedot();
					varas.tulostaTiedot();
					soturi.tulostaTiedot();
					break;
				default:
					tulosta("Virheellinen sy�te");
			}
		}
		
		tulosta("Valitse nimi: ");
		String nimi = lukija.nextLine();
		
		Hahmo hahmo = new Hahmo(nimi, rotu, luokka);
		hahmo.tulostaHahmo();
		
		int i = 0;
		
		while(i == 0) {
			tulosta("(1) Kehit� voimaa");
			tulosta("(2) Kehit� nopeutta");
			tulosta("(3) Kehit� taikaa");
			tulosta("(9) Tulosta hahmontiedot ja lopeta");
			
		
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
					tulosta("Virheellinen sy�te");
			}
		}
		

	}
	
	public static void tulosta(String lause) {
		System.out.println(lause);
	}
	
	public static final Scanner lukija = new Scanner(System.in);

}
