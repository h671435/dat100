package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Oppgave1 {

	public static void main(String[] args) {
		
		String heltall1 = showInputDialog("Skriv inn lengde :");
		String heltall2 = showInputDialog("Skriv inn bredde :");

		int lengde = Integer.parseInt(heltall1);
		int bredde = Integer.parseInt(heltall2);
		int svar = lengde * bredde;
		
		System.out.println("Arealet på rektangelen er: " + svar);
	
	}


}
