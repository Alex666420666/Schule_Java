package B_Verzweigung;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class bmi_rechner {
 
    public static double calculation(double gewicht, double groesse) {
        return gewicht / Math.pow(groesse / 100, 2);
    }
 
    public static String valuation(double input) {
 
        String output = null;
 
        if (input < 16 && input > 0) {
            output = "Starkes Untergewicht";
        } else if (input >= 16 && input < 17) {
            output = "Mäßiges Untergewicht";
        } else if (input >= 17 && input < 18.5) {
            output = "Leichtes Untergewicht";
        } else if (input >= 18.5 && input < 25) {
            output = "Normalgewicht";
        } else if (input >= 25 && input < 30) {
            output = "Präadipositas";
        } else if (input >= 30 && input < 35) {
            output = "Adipositas Grad I";
        } else if (input >= 35 && input < 40) {
            output = "Adipositas Grad II";
        } else if (input >= 40) {
            output = "Adipositas Grad III";
        } else if (input < 0) {
            output = "ERROR";
        }
 
        return output;
    }
 
    public static void showUI() {
 
        JFrame frame = new JFrame();
        BoxLayout layout = new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS);
        JButton okButton = new JButton();
        JTextField inputFieldGewicht = new JTextField();
        JTextField inputFieldGroesse = new JTextField();
        JTextField outputField = new JTextField();
 
        JLabel gewicht = new JLabel("Gewicht:");
        JLabel groesse = new JLabel("Größe:");
 
        frame.setSize(300, 180);
        frame.setLayout(layout);
 
        frame.add(groesse);
        frame.add(inputFieldGroesse);
        frame.add(gewicht);
        frame.add(inputFieldGewicht);
        frame.add(okButton);
        frame.add(outputField);
 
        outputField.setEditable(false);
 
        okButton.setText("Bestätigen");
 
        okButton.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                double output = calculation(Integer.parseInt(inputFieldGewicht.getText()),
                        Integer.parseInt(inputFieldGroesse.getText()));
                outputField.setText(valuation(output));
            }
        });
 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
 
    }
 
    public static void main(String[] args) {
        showUI();
    }
}