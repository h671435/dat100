package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oblig3 {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("Skriv inn et tall"));

	    int x = 1;
	    
		int a = n;
		
		while (n > 0) {
			x *= n;
			n--;
		}
		System.out.println(a + "! = " + x);
			 
	
	}

}