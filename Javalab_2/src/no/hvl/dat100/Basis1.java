package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;


public class Basis1 {

	public static void main(String[] args) {
		double radius = Double.parseDouble(showInputDialog("Skriv inn radius her: "));
		
		double sum = (4*PI*radius*radius*radius)/3;
		
		System.out.println(sum);
		
	}

}
