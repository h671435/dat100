package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Basis3 {

	public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");
		
		String riktig_bnavn = "Storm";
		String riktig_pssrd = "1234";

		
		
		if (brukernavn.equals(riktig_bnavn) && (passord.equals(riktig_pssrd))) {
			showMessageDialog(null, "Du er logget inn!");
			
		} else {
            showMessageDialog(null, "Vær vennlig og tast inn riktig brukernavn og passord");  
		}
	
	}

}