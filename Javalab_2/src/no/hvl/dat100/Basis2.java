package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Basis2 {

	public static void main(String[] args) {

		int pris = Integer.parseInt(showInputDialog("Skriv inn prisen her: "));
		int beløp = Integer.parseInt(showInputDialog("Skriv inn beløpet du betaler her: "));
		
		int vekslepenger = beløp - pris;
		int ti = vekslepenger / 10;
		int en = vekslepenger % 10;
		
		showMessageDialog(null, "Vekslepenger: " + ti + " ti kroning(er) " + en + " kroner");
		
		
			}

}
