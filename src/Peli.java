

import java.util.*;	
import java.io.*;


public class Peli {
	
	final static Scanner lukija = new Scanner(System.in);
	

	public static void main(String[] args) throws FileNotFoundException {
		Hahmo hahmo = new Hahmo();
		tulosta("Askarta. \n");
		tulosta("T�m� l�ntinen maanosa tunnetaan sen lukuisista vuorista ja mainiosta vuohenjuustosta, \n"
				+ "jos silmi�si ja er�st� matkakumppaniasi on yht��n uskominen.\n"
				+ "Kuukausien vankeus on selke�sti tehnyt teht�v�ns�. \n"
				+ "Matkakumppanisi sepitt�� tarinaa Askartan historiasta ja sen nykyisest� poliittisesta ilmapiirist�, \n"
				+ "mutta n�m� asiat eiv�t sinua juuri kiinnosta. \n"
				+ "Aistisi janoavat jotain muuta, jotain parempaa � kuin kylm� selli ja vanhentunut leip�.\n" 
				+ "Olet edelleen vanki�, muistutat itsellesi.");
		lukija.nextLine();
		tulosta("Askartan majesteettiset vuoristot saavat sinut unohtamaan, \n"
				+ "edes pieneksi hetkeksi, oman vankeutesi. Etk� ole en�� istumassa kylm�ss� selliss�si,\n"
				+ "laskemassa p�ivi� kunnes sinulle lausutaan lopullinen tuomiosi.\n"
				+ "Etel�inen vankileirien saaristo, sinne olet matkalla Helevurnen kuningaskunnan vuokraamassa ilma-aluksessa.\n"
				+ "Siirryt kylm�st� sellist� toiseen,\n"
				+ "mutta t�ll� kertaa sinun ei tarvitse laskea p�ivi� tai odottaa tuomiota - tulet viett�m��n siell� loppuik�si.");
		lukija.nextLine();
		tulosta("T�t� keskikokoista, jokseenkin vanhahkoa, ilma-asusta operoivat pienet, vihre�nkellert�v�t peikot."
				+ "He ovat tunnetusti taitavia insin��rej�, \n"
				+ "mutta maailman ja sen historian mittakaavassa kyseess� on varsin mit�t�n rotu. \n"
				+ "Peikot ahertavat taukoamatta ja suurella huolella. \n"
				+ "He eiv�t juurikaan v�lit� ilma-aluksen �rahdista�,\n"
				+ "mutta he tiet�v�t, ett� ep�onnistuminen t�ss� teht�v�ss� voi helposti johtaa heid�n vaatimattoman rotunsa tuhoon. \n"
				+ "N�in k�vi haltijoille, kun heid�n diplomaattinsa holtittomasti mainitsi Helevurnen kuninkaan pakenevasta hiusrajasta.\n"
				+ "Kuninkaan viha, varsinkin muita rotuja kohtaan, on varsin legendaarinen.");
		lukija.nextLine();
		tulosta("�� ja sen hovinarrin l�pp� oli sit� tasoa, et Askartan herttuatar kuoli nauruun, hya hya hyaaah!� \n"
				+ "T�m� aasinomainen nauru k��pi�n suusta kuului matkakumppanillesi, \n"
				+ "joka oli vihdoin ja viimein saanut tarinansa p��t�kseen.\n"
				+ "�Hyaaah, ai et ku teki eetvarttia puhua jollekin muulle kuin sellin seinille! \n"
				+ "Ei mulla niit� mit��n vastaan ole, hyvi� kuuntelijoita kaikki nelj�, hya hya hyaaah!� \n"
				+ "Ny�kk�sit, vaikka kuuntelemisen taidoissa sellin sein�t taisivat vied� voiton aika selke�sti.");
		lukija.nextLine();
		tulosta("�No m� olen h�p�tt�miseni h�pott�nyt, joten annetaan sullekin suunvuoro. \n"
				+ "M� jatkaisin muuten, mut pidempi tarinointi vaatii v�h�n suun kostuketta,\n"
				+ "EIK� SIT� TARJOTA T��LL� POLIITTISILLE VANGEILLE!�");
		lukija.nextLine();		
		tulosta("�Nii, mik�s sun nimi olikaan?�\n");
		
		hahmo.valitseNimi();
		
		tulosta("\nK��pi� yritt�� k�tell� sinua, ilmeisesti unohtaen, ett� h�nen k�tens� ovat edelleen sidotut.\r\n" 
				+ "�Hya hya hyaaah! Kato ny, mit� n�m� kopoltinperseet on tehny meille, \n"
				+ "varsinkin MULLE, JOKA ON EDELLEEN POLIITTINEN VANKI, \n"
				+ "JOLTA ON NYT MY�S EV�TTY MAHDOLLISUUS NOUDATTAA PYHI� K��PI�PERINTEIT�!� \n"
				+ "Katselet ymp�rillesi ja odotat (ehk� jopa toivot), ett� vartija hiljent�isi h�net, \n"
				+ "mutta he eiv�t ole ollenkaan liikuttuneita. Luultavasti ovat jo tottuneet k��pi�toverisi mielenpurkauksiin.");
		lukija.nextLine();
		tulosta("�Hya hya, vai ett� " +  hahmo.getNimi() +"! \n"
				+ "Hei, ny ku m� katon sua v�h�n tarkemmin� \n"
				+ "Roknarin pyh�n takkuisen parran kautta� s�h�n oot��\n");
		
		hahmo.valitseRotu("rodut.txt");
		
		tulosta("�S�h�n oot " + hahmo.getRotu() + "!�");
		tulosta("K��pi� hiljenee v�h�ksi aikaa, mutta avaa taas suunsa ennen pitk��:\n"
				+ "�No " + hahmo.getNimi() + ", mist� j�it kii? Kuka vasikoi? \n"
				+ "Onks vasikalla kirves nii syv�ll� p��ss�, et ainoastaan joku legendaarinen sankari voi repi� sen irti? \n"
				+ "M� oon EDELLEEN POLIITTINEN VANKI� mut ent�s s�?�\n");
		
		hahmo.valitseLuokka("luokat.txt");
		tulosta("�Olet " + hahmo.getLuokka() + "!�");
		
		int i = 0;
		while(i == 0) {
			tulosta("(1) Avaa lootBox\n"
					+ "(2) Lopeta");
			
			String valinta = lukija.nextLine();
			switch(valinta) {
				case "1":
					LootBox boxi = new LootBox("Esineet.txt");
					boxi.arvoBoxi();
					boxi.tulostaBoxi();
					break;
				case "2":
					i = 1;
					break;
				default:
					tulosta("virheellinen valinta");
			}
		}
		tulosta("THE END....");
		
		
	}
	
	public static void tulosta(String lause) {
		System.out.println(lause);
	}
	
	
}
