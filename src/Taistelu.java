import java.util.*;
import java.io.*;

public class Taistelu {
	private Hahmo p;
	private Hahmo v;
	private Scanner lukija;
	private Random rand;
	
	public Taistelu(Hahmo p, Hahmo v)  {
		this.p = p;
		this.v = v;
		lukija = new Scanner(System.in);
		rand = new Random();
	}
	
	public void taistele() {
		
		while(p.getHp() > 0 && v.getHp() > 0) {
			p.tulostaNimiHp();
			v.tulostaNimiHp();
			tulosta("Valise isku: ");
			p.tulostaIskuNimet();
			
				int syote = lukija.nextInt();
				int vIsku = rand.nextInt(3);
			
				
			
			if(checkSpe(p.getIsku(syote-1),v.getIsku(vIsku))) {
				pHyokkaa(syote);
				p.tulostaNimiHp();
				v.tulostaNimiHp();
				if(v.getHp() > 0) {
					vHyokkaa(vIsku);
					p.tulostaNimiHp();
					v.tulostaNimiHp();
				} else {
					tulosta("Voitit");
				}
				
			} else {
				vHyokkaa(vIsku);
				p.tulostaNimiHp();
				v.tulostaNimiHp();
				if(p.getHp() > 0) {
					pHyokkaa(syote-1);
					p.tulostaNimiHp();
					v.tulostaNimiHp();
				} else {
					tulosta("Hävisit");
					
				}
			}
		}
			
	}
	
	public boolean checkSpe(Isku pIsku, Isku vIsku) {
		if((pIsku.getSpe() + p.getSpe()) >= (vIsku.getSpe() + v.getSpe())) {
			return true;
		} else {
			return false;
		}
	}
	
	public void pHyokkaa(int i) {
		if((rand.nextInt(19) + p.getIsku(i - 1).getAcc()) >= 10) {
			int bonus = 0;
			if(v.getRotu().equals(p.getIsku(i - 1).getHeikkous())) {
				bonus -= 2;
			} 
			if(v.getRotu().equals(p.getIsku(i - 1).getVahvuus())) {
				bonus += 2;
			}
			v.otaVahinkoa(p.getLvl()+p.getAtt()+p.getIsku(i - 1).getAtt() + bonus);
		} else {
			tulosta("Ohi meni!");
		}
	}
	
	public void vHyokkaa(int i) {
		if((rand.nextInt(19) + v.getIsku(i - 1).getAcc()) >= 10) {
			int bonus = 0;
			if(p.getRotu().equals(v.getIsku(i - 1).getHeikkous())) {
				bonus -= 2;
			} 
			if(p.getRotu().equals(v.getIsku(i - 1).getVahvuus())) {
				bonus += 2;
			}
			p.otaVahinkoa(v.getLvl()+v.getAtt()+v.getIsku(i - 1).getAtt() + bonus);
		} else {
			tulosta("Ohi meni!");
		}
	}
	
	public void tulosta(String lause) {
		System.out.println(lause);
	}
	
	
	
}
