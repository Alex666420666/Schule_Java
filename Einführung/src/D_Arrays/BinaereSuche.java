package D_Arrays;

import java.util.Arrays;

public class BinaereSuche {

	public void suche(int [] methodenArray, int anfang, int ende, int zahl) {
		
		if(methodenArray.length == 0) {
			System.out.println("Der Array ist leer");	
		}
		
		int grenze;
		
		grenze = anfang + (ende-anfang)/2;
		
		if(grenze >= methodenArray.length) {
			System.out.println("Das Suchintervall ist zu groß");
		}
		
		if(zahl>methodenArray[grenze]) {
			suche(methodenArray, grenze, ende, zahl);
		}else if(zahl < methodenArray[grenze] && anfang != grenze) {
			suche(methodenArray, anfang, grenze-1, zahl);
		}else if(zahl == methodenArray[grenze]) {
			System.out.println("\nDie gesuchte Zahl "+ zahl +" befindet sich im Array an Position " + (grenze+1));
		}else {
			System.out.println("\nDie gesuchte Zahl ist nicht im Array enthalten");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] test =  {5,3,27,69,28,2,115,588,53,115,120};
	
		Arrays.sort(test);
		
		for(int i = 0; i < test.length; i++) {
			System.out.println(test[i]+" ");
		}
		
		BinaereSuche objekt = new BinaereSuche();
		
		objekt.suche(test, 0, test.length, 53);
	}

}
