

import java.util.*;	
import java.io.*;


public class Peli {
	
	final static Scanner lukija = new Scanner(System.in);
	

	public static void main(String[] args) throws FileNotFoundException {
		Hahmo hahmo = new Hahmo();
		tulosta("Askarta. \n");
		tulosta("Tämä läntinen maanosa tunnetaan sen lukuisista vuorista ja mainiosta vuohenjuustosta, \n"
				+ "jos silmiäsi ja erästä matkakumppaniasi on yhtään uskominen.\n"
				+ "Kuukausien vankeus on selkeästi tehnyt tehtävänsä. \n"
				+ "Matkakumppanisi sepittää tarinaa Askartan historiasta ja sen nykyisestä poliittisesta ilmapiiristä, \n"
				+ "mutta nämä asiat eivät sinua juuri kiinnosta. \n"
				+ "Aistisi janoavat jotain muuta, jotain parempaa – kuin kylmä selli ja vanhentunut leipä.\n" 
				+ "Olet edelleen vanki”, muistutat itsellesi.");
		lukija.nextLine();
		tulosta("Askartan majesteettiset vuoristot saavat sinut unohtamaan, \n"
				+ "edes pieneksi hetkeksi, oman vankeutesi. Etkä ole enää istumassa kylmässä sellissäsi,\n"
				+ "laskemassa päiviä kunnes sinulle lausutaan lopullinen tuomiosi.\n"
				+ "Eteläinen vankileirien saaristo, sinne olet matkalla Helevurnen kuningaskunnan vuokraamassa ilma-aluksessa.\n"
				+ "Siirryt kylmästä sellistä toiseen,\n"
				+ "mutta tällä kertaa sinun ei tarvitse laskea päiviä tai odottaa tuomiota - tulet viettämään siellä loppuikäsi.");
		lukija.nextLine();
		tulosta("Tätä keskikokoista, jokseenkin vanhahkoa, ilma-asusta operoivat pienet, vihreänkellertävät peikot."
				+ "He ovat tunnetusti taitavia insinöörejä, \n"
				+ "mutta maailman ja sen historian mittakaavassa kyseessä on varsin mitätön rotu. \n"
				+ "Peikot ahertavat taukoamatta ja suurella huolella. \n"
				+ "He eivät juurikaan välitä ilma-aluksen ”rahdista”,\n"
				+ "mutta he tietävät, että epäonnistuminen tässä tehtävässä voi helposti johtaa heidän vaatimattoman rotunsa tuhoon. \n"
				+ "Näin kävi haltijoille, kun heidän diplomaattinsa holtittomasti mainitsi Helevurnen kuninkaan pakenevasta hiusrajasta.\n"
				+ "Kuninkaan viha, varsinkin muita rotuja kohtaan, on varsin legendaarinen.");
		lukija.nextLine();
		tulosta("”… ja sen hovinarrin läppä oli sitä tasoa, et Askartan herttuatar kuoli nauruun, hya hya hyaaah!” \n"
				+ "Tämä aasinomainen nauru kääpiön suusta kuului matkakumppanillesi, \n"
				+ "joka oli vihdoin ja viimein saanut tarinansa päätökseen.\n"
				+ "”Hyaaah, ai et ku teki eetvarttia puhua jollekin muulle kuin sellin seinille! \n"
				+ "Ei mulla niitä mitään vastaan ole, hyviä kuuntelijoita kaikki neljä, hya hya hyaaah!” \n"
				+ "Nyökkäsit, vaikka kuuntelemisen taidoissa sellin seinät taisivat viedä voiton aika selkeästi.");
		lukija.nextLine();
		tulosta("”No mä olen höpöttämiseni höpottänyt, joten annetaan sullekin suunvuoro. \n"
				+ "Mä jatkaisin muuten, mut pidempi tarinointi vaatii vähän suun kostuketta,\n"
				+ "EIKÄ SITÄ TARJOTA TÄÄLLÄ POLIITTISILLE VANGEILLE!”");
		lukija.nextLine();		
		tulosta("”Nii, mikäs sun nimi olikaan?”\n");
		
		hahmo.valitseNimi();
		
		tulosta("\nKääpiö yrittää kätellä sinua, ilmeisesti unohtaen, että hänen kätensä ovat edelleen sidotut.\r\n" 
				+ "”Hya hya hyaaah! Kato ny, mitä nämä kopoltinperseet on tehny meille, \n"
				+ "varsinkin MULLE, JOKA ON EDELLEEN POLIITTINEN VANKI, \n"
				+ "JOLTA ON NYT MYÖS EVÄTTY MAHDOLLISUUS NOUDATTAA PYHIÄ KÄÄPIÖPERINTEITÄ!” \n"
				+ "Katselet ympärillesi ja odotat (ehkä jopa toivot), että vartija hiljentäisi hänet, \n"
				+ "mutta he eivät ole ollenkaan liikuttuneita. Luultavasti ovat jo tottuneet kääpiötoverisi mielenpurkauksiin.");
		lukija.nextLine();
		tulosta("”Hya hya, vai että " +  hahmo.getNimi() +"! \n"
				+ "Hei, ny ku mä katon sua vähän tarkemmin… \n"
				+ "Roknarin pyhän takkuisen parran kautta… sähän oot…”\n");
		
		hahmo.valitseRotu("rodut.txt");
		
		tulosta("”Sähän oot " + hahmo.getRotu() + "!”");
		tulosta("Kääpiö hiljenee vähäksi aikaa, mutta avaa taas suunsa ennen pitkää:\n"
				+ "”No " + hahmo.getNimi() + ", mistä jäit kii? Kuka vasikoi? \n"
				+ "Onks vasikalla kirves nii syvällä päässä, et ainoastaan joku legendaarinen sankari voi repiä sen irti? \n"
				+ "Mä oon EDELLEEN POLIITTINEN VANKI… mut entäs sä?”\n");
		
		hahmo.valitseLuokka("luokat.txt");
		tulosta("”Olet " + hahmo.getLuokka() + "!”");
		
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
