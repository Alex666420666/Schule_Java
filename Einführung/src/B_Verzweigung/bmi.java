package B_Verzweigung;
import java.util.Scanner;
 
public class bmi {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
         
         
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Geben Sie Ihr Gewicht ein:");
         
        double gewicht = scan1.nextDouble();
         
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Wie gro� sind Sie ? (Bsp.: 1,98)");
        double groesse = scan2.nextDouble();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Welches geschlecht haben sie : M�nnlich, Weiblich oder Divers");
        String geschlecht = scan3.nextLine();
        
        
        double bmi =  gewicht / (groesse * groesse);
        
        System.out.println("Ihre K�rperrform");
 
        switch(geschlecht) {
        
        case "M�nnlich":
        	if (bmi < 16) {
                System.out.println("Starkes Untergewicht");
            } else if (bmi >= 16.0 && bmi < 17.0) {
                System.out.println("M��iges Untergewicht");
            } else if (bmi >= 17.0 && bmi < 18.5) {
                System.out.println("Leichtes Untergeweicht");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("Normalgewicht");
            } else if (bmi >= 25.0 && bmi < 30.0) {
                System.out.println("Pr�adipositas");
            } else if (bmi >= 30.0 && bmi < 35.0) {
                System.out.println("Adipositas Grad I");
            } else if (bmi >= 35.0 && bmi < 40.0) {
                System.out.println("Adipositas Grad II");
            } else if (bmi >= 40.0) {
                System.out.println("Adipositas Grad III");
            }
        	
        	break;
        	
        case "Weiblich":
        
           	if (bmi < 16) {
                System.out.println("Starkes Untergewicht");
            } else if (bmi >= 16.0 && bmi < 17.0) {
                System.out.println("M��iges Untergewicht");
            } else if (bmi >= 17.0 && bmi < 18.5) {
                System.out.println("Leichtes Untergeweicht");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("Normalgewicht");
            } else if (bmi >= 25.0 && bmi < 30.0) {
                System.out.println("Pr�adipositas");
            } else if (bmi >= 30.0 && bmi < 35.0) {
                System.out.println("Adipositas Grad I");
            } else if (bmi >= 35.0 && bmi < 40.0) {
                System.out.println("Adipositas Grad II");
            } else if (bmi >= 40.0) {
                System.out.println("Adipositas Grad III");
            }
           	
           	break;
           	
        case "Divers":
           	if (bmi < 16) {
                System.out.println("Starkes Untergewicht");
            } else if (bmi >= 16.0 && bmi < 17.0) {
                System.out.println("M��iges Untergewicht");
            } else if (bmi >= 17.0 && bmi < 18.5) {
                System.out.println("Leichtes Untergeweicht");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("Normalgewicht");
            } else if (bmi >= 25.0 && bmi < 30.0) {
                System.out.println("Pr�adipositas");
            } else if (bmi >= 30.0 && bmi < 35.0) {
                System.out.println("Adipositas Grad I");
            } else if (bmi >= 35.0 && bmi < 40.0) {
                System.out.println("Adipositas Grad II");
            } else if (bmi >= 40.0) {
                System.out.println("Adipositas Grad III");
            }
        	
           	break;
       
       default:
    	   System.out.println("Kein Geschlecht = Ende");
           	 
           	
        }
        

    }
    
}