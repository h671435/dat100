package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Hoyder {

	public static void main(String[] args) {

		String melding = "Høyde i cm, avslutt med 0:";
		
		int sum = 0;
		int antall = 0;
		
		int hoyde = Integer.parseInt(showInputDialog(melding));
		while (hoyde != 0) {
			sum += hoyde;
			antall ++;
			hoyde = Integer.parseInt(showInputDialog(melding));
		}
		double gjennomsnitt = (double) sum / antall;
		System.out.print("Snitt; " + gjennomsnitt);
	}

}
