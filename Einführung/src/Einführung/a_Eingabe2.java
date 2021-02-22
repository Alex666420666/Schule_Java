package Einführung;

import java.util.Scanner;

public class a_Eingabe2 {
	
	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		int zahl1, ergebnis;
		
		System.out.println("Gebe eine zahl ein");
		
		zahl1 = eingabe.nextInt();
		
		ergebnis = zahl1*10;
		
		System.out.println("Das Ergebnis aus Zahl1 mal 10 ist:" + ergebnis);
		
		eingabe.close();
		
		
	
		
		
	}

}
