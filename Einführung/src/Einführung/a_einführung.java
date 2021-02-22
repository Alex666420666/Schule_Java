package Einführung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class a_einführung {

	public static void main(String[] args) throws IOException{
	
		
		double zahl11;
		double zahl12;
		String eingabe;
		
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Zahl eingeben");
		eingabe = in.readLine();
		zahl11 = Double.parseDouble(eingabe);
		
		System.out.println("Zahl eingeben");
		eingabe = in.readLine();
		zahl12 = Double.parseDouble(eingabe);
		
		System.out.println("Die Addition von " + zahl11 + " und " + zahl12 + " ergibt " + (zahl11+zahl12));
		
		
	}

}

