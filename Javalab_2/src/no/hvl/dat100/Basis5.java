package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Basis5 {

	public static void main(String[] args) {
		
		
		
		int karakter = Integer.parseInt(showInputDialog("Skriv inn poengsum her: "));
		
		
		if (karakter >= 90 && karakter <= 100) {
			showMessageDialog(null, "Du får karakteren A");
		}
		
		if (karakter >= 80 && karakter <= 89) {
			showMessageDialog(null, "Du får karakteren B");
		}
		
		if (karakter >= 60 && karakter <= 79) {
			showMessageDialog(null, "Du får karakteren C");
		}
		
		if (karakter >= 50 && karakter <= 59) {
			showMessageDialog(null, "Du får karakteren D");
		}
		
		if (karakter >= 40 && karakter <= 49) {
			showMessageDialog(null, "Du får karakteren E");
		}
		
		if (karakter >= 0 && karakter <= 39) {
			showMessageDialog(null, "Du får karakteren F");
		}
		if (karakter < 0 || karakter > 100)
			showMessageDialog(null, "Vennligst tast inn en gyldig poengsum");
	}

}
