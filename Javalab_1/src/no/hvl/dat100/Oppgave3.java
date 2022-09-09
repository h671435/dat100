package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Oppgave3 {

	public static void main(String[] args) {
		
		String dagnummer = showInputDialog("Skriv inn dato :");
		String månedsnummer = showInputDialog("Skriv inn Måned i tallform :");
		String årsnummer = showInputDialog("Skriv inn årstall :");

		int day = Integer.parseInt(dagnummer);
		int month = Integer.parseInt(månedsnummer);
		int year = Integer.parseInt(årsnummer);
		String dato = day + "." + month + "." + year + ".";

		
		showMessageDialog(null, dato);
	
	}


}
