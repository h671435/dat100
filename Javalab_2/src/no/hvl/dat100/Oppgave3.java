package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {

	public static void main(String[] args) {
		int a, b;
		
		// Henter inn tall
		a = Integer.parseInt(showInputDialog("Skriv et heltall"));
		b = Integer.parseInt(showInputDialog("Skriv et heltall"));
		
		
		if (b == 0) {
			showMessageDialog(null, "0 er ikke gjodkjent");
			
		} else {
			int sum = a/b;
			showMessageDialog(null, sum);
		}
		
	}

}
