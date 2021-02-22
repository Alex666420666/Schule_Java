package Einführung;

import java.util.Scanner;

public class e_temperatur {

	public static void main(String[] args) {
		

		Scanner eingabe = new Scanner(System.in);
		
		double zahl1;
		
		System.out.println("Gebe aktuelle Temperatur ein");
		
		zahl1 = eingabe.nextInt();
		
		
		
		if(zahl1 <= 0)  
			System.out.println("Es ist sehr kalt");
		else if(zahl1 <= 10) 
			System.out.println("Es ist kalt");	
		else if(zahl1 <= 20) 
			System.out.println("Es ist Lauwarm");	
		else if(zahl1 <= 30)
			System.out.println("Es ist Warm");
		else if(zahl1 <= 40)
			System.out.println("Es ist heiß");
		else 
			System.out.println("Geh nicht vor die Tür");
		
		eingabe.close();
		
		
	
		
		

	}

}
