

import java.util.*;	
import java.io.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Peli extends Application{
	
	final static Scanner lukija = new Scanner(System.in);
	
	public void start(Stage ikkuna) throws FileNotFoundException {
		
		
		Hahmo hahmo = new Hahmo();
		hahmo.valitseRotu("rodut.txt");
		hahmo.valitseLuokka("luokat.txt");
		hahmo.valitseNimi();
		
		HBox rivi1 = new HBox();
		HBox rivi2 = new HBox();
		HBox rivi3 = new HBox();
		HBox rivi4 = new HBox();
		HBox rivi5 = new HBox();
		HBox rivi6 = new HBox();
		HBox rivi7 = new HBox();
		HBox rivi8 = new HBox();
		rivi1.getChildren().add(new Label("Nimi: " + hahmo.getNimi()));
		rivi2.getChildren().add(new Label("Rotu: " + hahmo.getRotu()));
		rivi3.getChildren().add(new Label("Luokka: " + hahmo.getLuokka()));
		rivi4.getChildren().add(new Label("HP" + hahmo.getHp() + "/" + hahmo.getMaxHp()));
		
		rivi5.getChildren().add(new Label("Voima: " + hahmo.getVoima()));
		rivi5.getChildren().add(new Button("Kehitä"));
		rivi5.setSpacing(10);
		
		rivi6.getChildren().add(new Label("Nopeus: " + hahmo.getNopeus()));
		rivi6.getChildren().add(new Button("Kehitä"));
		rivi6.setSpacing(10);
		
		rivi7.getChildren().add(new Label("Taika: " + hahmo.getTaika()));
		rivi7.getChildren().add(new Button("Kehitä"));
		rivi7.setSpacing(10);
		VBox rivit = new VBox();
		
		rivit.getChildren().add(rivi1);
		rivit.getChildren().add(rivi2);
		rivit.getChildren().add(rivi3);
		rivit.getChildren().add(rivi4);
		rivit.getChildren().add(rivi5);
		rivit.getChildren().add(rivi6);
		rivit.getChildren().add(rivi7);
		BorderPane asettelu = new BorderPane();
		asettelu.setCenter(rivit);
		
				
				
		Scene nakyma = new Scene(asettelu, 225, 225, Color.RED);
				
		ikkuna.setTitle("BINGO!");
		ikkuna.setScene(nakyma);
		ikkuna.show();//
		
		
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		launch(Peli.class);
		
		
		Hahmo hahmo = new Hahmo();
		hahmo.valitseRotu("rodut.txt");
		hahmo.valitseLuokka("luokat.txt");
		hahmo.valitseNimi();
		
		
		
		hahmo.tulostaHahmo();
		
		int i = 0;
		
		while(i == 0) {
			tulosta("\n=========================\n");
			tulosta("(1) Kehitä voimaa");
			tulosta("(2) Kehitä nopeutta");
			tulosta("(3) Kehitä taikaa");
			tulosta("(4) Avaa LootBox");
			tulosta("(10) Tulosta hahmontiedot");
			tulosta("(69) lopeta");
			
		
			String x = lukija.next();
			switch (x) {
				case "1":
					hahmo.kehitaVoimaa(1);
					break;
				case "2":
					hahmo.kehitaNopeutta(1);
					break;
				case "3":
					hahmo.kehitaTaikaa(1);
					break;
				case "4":
					LootBox box = new LootBox("Esineet.txt");
					box.arvoBoxi();
					box.tulostaBoxi();
					for(int k = 0; k < 3; k ++) {
						hahmo.kehitaVoimaa(box.palautaEsine(i).getVoima());
						hahmo.kehitaNopeutta(box.palautaEsine(i).getNopeus());
						hahmo.kehitaTaikaa(box.palautaEsine(i).getTaika());
					}
 					break;
 					
				case "10":
					hahmo.tulostaHahmo();
					break;
				case "69":
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
	

}
