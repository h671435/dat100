package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Do_While {

	public static void main(String[] args) {
		String melding = "Resultat av kast? ";
		
		final int GRENSE = 13;
		
		int sum = 0;
		int antall = 0;
		do { 
			int verdi = Integer.parseInt(showInputDialog(melding));
			antall ++;
			sum += verdi; // Kort form for sum = sum + verdi
		} while (sum < GRENSE);
		
		System.out.println("Antall kast for å nå " + GRENSE + " er " + antall);

	}

}
