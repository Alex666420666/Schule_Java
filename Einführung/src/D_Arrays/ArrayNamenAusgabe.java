package D_Arrays;

import java.util.Arrays;

public class ArrayNamenAusgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String [10];
		int x;
		
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
