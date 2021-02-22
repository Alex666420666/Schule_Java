package B_Verzweigung;
import java.util.Scanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
	public class bmi_mit_frame {
	 
		    public static String rechner(double input) {
		    	
		    	String output = null;
		   
		        Scanner scan1 = new Scanner(System.in);
		        System.out.println("Geben Sie Ihr Gewicht ein:");
		         
		        double gewicht = scan1.nextDouble();
		         
		        Scanner scan2 = new Scanner(System.in);
		        System.out.println("Wie groß sind Sie ? (Bsp.: 1,98)");
		        double groesse = scan2.nextDouble();
		
		        Scanner scan3 = new Scanner(System.in);
		        System.out.println("Welches geschlecht haben sie : Männlich, Weiblich oder Divers");
		        String geschlecht = scan3.nextLine();
		        
		        
		        double bmi =  gewicht / (groesse * groesse);
		        
		        System.out.println("Ihre Körperrform");
		 
		        switch(geschlecht) {
		        
		        case "Männlich":
		        	if (bmi < 16) {
		                output = "Starkes Untergewicht";
		            } else if (bmi >= 16.0 && bmi < 17.0) {
		            	output = "Mäßiges Untergewicht";
		            } else if (bmi >= 17.0 && bmi < 18.5) {
		            	output = "Leichtes Untergeweicht";
		            } else if (bmi >= 18.5 && bmi < 25.0) {
		            	output = "Normalgewicht";
		            } else if (bmi >= 25.0 && bmi < 30.0) {
		            	output = "Präadipositas";
		            } else if (bmi >= 30.0 && bmi < 35.0) {
		            	output ="Adipositas Grad I";
		            } else if (bmi >= 35.0 && bmi < 40.0) {
		            	output ="Adipositas Grad II";
		            } else if (bmi >= 40.0) {
		            	output = "Adipositas Grad III";
		            }	
		        	
		        	return output;
		        	
		        	
		        	
		        case "Weiblich":
		        
		           	if (bmi < 16) {
		           		output = "Starkes Untergewicht";
		            } else if (bmi >= 16.0 && bmi < 17.0) {
		            	output = "Mäßiges Untergewicht";
		            } else if (bmi >= 17.0 && bmi < 18.5) {
		            	output = "Leichtes Untergeweicht";
		            } else if (bmi >= 18.5 && bmi < 25.0) {
		            	output = "Normalgewicht";
		            } else if (bmi >= 25.0 && bmi < 30.0) {
		            	output = "Präadipositas";
		            } else if (bmi >= 30.0 && bmi < 35.0) {
		            	output = "Adipositas Grad I";
		            } else if (bmi >= 35.0 && bmi < 40.0) {
		            	output = "Adipositas Grad II";
		            } else if (bmi >= 40.0) {
		            	output = "Adipositas Grad III";
		            }
		           	
		           	return output;
		           	
		           
		           	
		        case "Divers":
		           	if (bmi < 16) {
		           		output = "Starkes Untergewicht";
		            } else if (bmi >= 16.0 && bmi < 17.0) {
		            	output = "Mäßiges Untergewicht";
		            } else if (bmi >= 17.0 && bmi < 18.5) {
		            	output = "Leichtes Untergeweicht";
		            } else if (bmi >= 18.5 && bmi < 25.0) {
		            	output = "Normalgewicht";
		            } else if (bmi >= 25.0 && bmi < 30.0) {
		            	output = "Präadipositas";
		            } else if (bmi >= 30.0 && bmi < 35.0) {
		            	output = "Adipositas Grad I";
		            } else if (bmi >= 35.0 && bmi < 40.0) {
		            	output = "Adipositas Grad II";
		            } else if (bmi >= 40.0) {
		            	output = "Adipositas Grad III";
		            }
		        	
		           	return output;
		       
		       default:
		    	   System.out.println("Kein Geschlecht = Ende");
		         
		    	   
		     }
				return output;
		       
		      
		}
		
		    
		public static void showUI() {
			
			JFrame frame = new JFrame();
			BoxLayout layout = new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS);
			JButton okButton = new JButton();
			JTextField inputFieldGewicht = new JTextField();
		    JTextField inputFieldGroesse = new JTextField();
		    JTextField inputFliedgeschlecht = new JTextField();
		    JTextField outputField = new JTextField();
		    
		    JLabel gewicht = new JLabel("Gewicht:");
	        JLabel groesse = new JLabel("Größe:");
	        JLabel geschlecht = new JLabel("Geschlecht");
	        
	        frame.setSize(450, 270);
	        frame.setLayout(layout);
		    
	        frame.add(groesse);
	        frame.add(inputFieldGroesse);
	        frame.add(gewicht);
	        frame.add(inputFieldGewicht);
	        frame.add(geschlecht);
	        frame.add(inputFliedgeschlecht);
	        frame.add(okButton);
	        frame.add(outputField);
	        
	        outputField.setEditable(false);
	        okButton.setText("Bestätigen");
		    
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        
	        
		}
		       
		public static void main(String[] args) {
			showUI();
			
		}

	
	
	
}
		
			
	