
public class Isku {
	private String nimi;
	private int att;
	private int spe;
	private int acc;
	private String heikkous;
	private String vahvuus;
	
	public Isku(String nimi, int att, int spe, int acc, String heikkous, String vahvuus) {
		this.nimi = nimi;
		this.att = att;
		this.spe = spe;
		this.acc = acc;
		this.heikkous = heikkous;
		this.vahvuus = vahvuus;
	}
	
	public String getNimi() {
		return nimi;
	}
	
	public int getAtt() {
		return att;
	}
	
	public int getSpe() {
		return spe;
	}
	
	public int getAcc() {
		return acc;
	}
	
	public String getHeikkous() {
		return heikkous;
	}
	
	public String getVahvuus() {
		return vahvuus;
	}
	
	public String toString() {
		return("Nimi: " + nimi + "\nHyökkäys: "  + att + "\nNopeus: " + spe + "\nTarkkuus: " + acc + "\nHeikkous(VS.): " + heikkous + "\nVahvuus(VS.): " + vahvuus);
	}

}
