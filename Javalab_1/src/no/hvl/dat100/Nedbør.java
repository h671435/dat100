package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Nedbør {

	public static void main(String[] args) {

		final int ANT_DAGER = 7;
		int sum = 0;
		for (int dagnr = 1; dagnr <= ANT_DAGER; dagnr++) {
			int nedbor = Integer.parseInt(showInputDialog("Dag " + dagnr));
			sum += nedbor;
		}
		System.out.println("Samlet nedbør" + sum);
	}

}
