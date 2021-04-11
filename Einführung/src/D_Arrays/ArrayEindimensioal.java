package D_Arrays;

import java.util.Arrays;

public class ArrayEindimensioal {

	public static void main(String[] args) {
	
		int temperatur [];
		int i;
		String[] names = new String [10];
		int x;
		
		temperatur = new int [7];
		
		temperatur [0] = 8;
		temperatur [1] = 10;
		temperatur [2] = 13;
		temperatur [3] = 16;
		temperatur [4] = 15;
		temperatur [5] = 12;
		temperatur [6] = 3;
		
		System.out.println("Die Temperatur am Donnerstag betrug " + temperatur[3] + " Grad Celcius");
		
		System.out.println("Die Temperaturen der vergangen Woche:");
		for(i=0; i < temperatur.length; i++) {
			System.out.println(temperatur[i]);
		}
			
		//Ausgabe der Komponenten meines Arrays

		System.out.println("Der Array enthält " + temperatur.length + " Komponenten / Speicherplätze");
		
		//Eingabe Namen
		
		names [0] = "Alex";
		names [1] = "Fadi";
		names [2] = "Tim";
		names [3] = "Leon";
		names [4] = "Roman";
		names [5] = "Orcun";
		names [6] = "Moritz";
		names [7] = "Florian";
		names [8] = "David";
		names [9] = "Rabir";
		
		// Ausgabe
		
		System.out.println("Der Vierte Schüler in dieser liste ist " + names[3]);
		
		System.out.println("Alle Namen in der Liste" );
		for(x=0; x < names.length; x++) {
			System.out.println(names[x]);
		}
		
	}

}
