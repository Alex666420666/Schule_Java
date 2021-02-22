package C_Schleifen;

import java.util.Scanner;

public class C_Fakultät {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner( System.in );
	    long n, fakultaet = 1;
	    
	    // Eingabe aufforderng für N (Die Zahl mit der die Fakultaet berechnen werden soll)
	    System.out.println( "Geben Sie N ein:" );
	    n = scan.nextLong();

	    // Berechnung der Faklutaet
	    if ( n >= 0 )
	    {
	      while ( n > 1 )
	      {
	        fakultaet = fakultaet * n;
	        n   = n - 1;
	      }
	      
	    // Ausgabe
	      System.out.println( "Fakultaet ist " + fakultaet );
	    }
	    else
	    {
	      System.out.println("N muss 0 oder groesser sein");
	    }
	 
	}

}
