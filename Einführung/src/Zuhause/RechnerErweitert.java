package Zuhause;

import java.util.Scanner;

public class RechnerErweitert {

	private static Scanner eingabe;

	public static void main(String[] args) {
		
		eingabe = new Scanner(System.in);
		
		double zahl1;
		double zahl2;
		
		// Eingabe 1
		
		System.out.println("Gebe deine erste Zahl ein");
		
		zahl1 = eingabe.nextInt();
		
		// Eingabe 2
		
		System.out.println("Gabe deine zweite Zahl ein");
		
		zahl2 = eingabe.nextInt();
		
		// Ausgabe Zahl 1 und Zahl 2
		
		// Ausrechnen der Ergebnise 
		
		double sumA = zahl1 + zahl2;
		double sumS = zahl1 - zahl2;
		double sumM = zahl1 * zahl2;
		double sumD = zahl1 / zahl2;
		
		// Addition
		
		System.out.println("Die Addition aus deiner ersten zahl under deiner zweiten Zahl ergibt: " + sumA  );
		
		// Subtraktion
		
		System.out.println("Die Subtraktion aus deiner ersten Zahl und deiner zwieten Zahl ergibt: " + sumS);
		
		// Multiplikation
		
		System.out.println("Die Multiplikation aus deiner ersten Zahl und deiner zwiten zahl ergibt: " + sumM);
		
		// Divison
		
		System.out.println("Die Divison aus deiner ersten Zahl und deiner zwiten Zahl ergibt: " + sumD);
		
		// Ende 
			
		
		
	}

}
