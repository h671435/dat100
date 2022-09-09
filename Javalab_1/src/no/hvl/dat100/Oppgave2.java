package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Oppgave2 {

	public static void main(String[] args) {
		
		String tall1 = showInputDialog("Skriv inn et tall :");
		String tall2 = showInputDialog("Skriv inn et tall :");
		String tall3 = showInputDialog("Skriv inn et tall :");
		String tall4 = showInputDialog("Skriv inn et tall :");

		double en = Integer.parseInt(tall1);
		double to = Integer.parseInt(tall2);
		double tre = Integer.parseInt(tall3);
		double fire = Integer.parseInt(tall4);

		double minNum = Math.min(en, to);
		minNum = Math.min(tre, minNum);
		minNum = Math.min(fire, minNum);
		
		
		System.out.println(minNum);
	
	}


}
