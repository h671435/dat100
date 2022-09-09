package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave4b {

	public static void main(String[] args) {
		
		final int ANT_TALL = 5;
		
		for (int i = 0; i < ANT_TALL; i++) {
			int tall = Integer.parseInt(showInputDialog("Skrive tall" + i));
		
		System.out.println(tall);
		}
	}

}