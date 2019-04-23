
public class Esine {
	private String nimi;
	private int att;
	private int spe;
	private int def;
	
	
	public Esine(String nimi, int att, int spe, int def) {
		this.nimi = nimi;
		this.att = att;
		this.spe = spe;
		this.def = def;
		
	}
	public void tulostaEsine() {
		System.out.println("Nimi: " + nimi);
		System.out.println("Hyökkäys: +" + att);
		System.out.println("Nopeus: +" + spe);
		System.out.println("Puolustus: +" + def + "\n");
	}
	
	public int getDef() {
		return def;
	}
	
	public int getAtt() {
		return att;
	}
	
	public int getSpe() {
		return spe;
	}
}
