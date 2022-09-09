package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Lekse_scope {

	public static void main(String[] args) {
		
		int mnd = 0;
		
		do {
		mnd = Integer.parseInt(showInputDialog("Månedsnummer: "));
		} while (mnd < 1 || mnd > 12);
		System.out.println(mnd);
		

	}

}
