// FUNKER IKKE SKIKKELIG

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class L_LøkkeMedValg {

	public static void main(String[] args) {
		
		final int NEDRE = 0;
		final int ØVRE = 10;
		
		// Intervallet, hvordan tilbakemelding
		String melding = "Tenk på et tall i området " + NEDRE + " - " + ØVRE + ".";
		showMessageDialog(null, melding);
		
		
		// Deklarere og gi startverdi til en del variabler
		int lav = NEDRE;
		int høy = ØVRE;
		int tall = NEDRE-1;
		boolean rettGjetta = false;
		
		
		do {
			tall = (lav + høy / 2);
			melding = "Tenkte du på " + tall + "? Skriv 0 for ja, -1 hvis for høyt og 1 hvis for lavt";
			int svar = Integer.parseInt(showInputDialog(melding));
			
			rettGjetta = (svar == 0);
			
			if (!rettGjetta) {
				if (svar == - 1) {
					høy = tall -1;
				} else {
					lav = tall + 1;
				}
			}
			
			
		} while (!rettGjetta);
			
			// Skriv ut en liten melding
		showMessageDialog(null, "Gratulerer!");
	}

}
