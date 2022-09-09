package no.hvl.dat100;

import java.util.Scanner;

public class Basis5B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Student nr: " + (i + 1));
			System.out.print("Tast inn poengsum: ");

			String input = sc.nextLine();
			int poengsum = Integer.parseInt(input);
			String karakter = null;

			if (poengsum >= 90 && poengsum <= 100) {
				karakter = "A";
			}

			if (poengsum >= 80 && poengsum <= 89) {
				karakter = "B";
			}

			if (poengsum >= 60 && poengsum <= 79) {
				karakter = "C";
			}

			if (poengsum >= 50 && poengsum <= 59) {
				karakter = "D";
			}

			if (poengsum >= 40 && poengsum <= 49) {
				karakter = "E";
			}

			if (poengsum >= 0 && poengsum <= 39) {
				karakter = "F";
			}

			if (poengsum < 0 || poengsum > 100) {
				System.out.println("Ugyldig poengsum, vennligst tast inn en gyldig poengsum.");
			} else {
				System.out.println("Studenten fikk karakteren " + karakter);

			}

		}
		sc.close();

	}
}
