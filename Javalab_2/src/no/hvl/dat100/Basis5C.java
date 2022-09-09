package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Basis5C {
    public static void main(String[] args) {


        for (int i = 0 ; i < 10; i++) {

            int poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum"));

        String karakter = "Du fikk: "; 


      if ((poeng >= 90) && (poeng <= 100)) {
        karakter += "A";

        } else if ((poeng >= 80) && (poeng <=89)) {
            karakter += "B";

        } else if ((poeng >= 60) && (poeng <=79)) {
            karakter += "C";

        } else if ((poeng >= 50) && (poeng <= 59)) {
            karakter += "D";

        } else if ((poeng >= 40) && (poeng <= 49)) {
            karakter += "E";

        } else if ((poeng >= 0) && (poeng <= 39)) {
            karakter += "F Du strøk";

        } else {
            karakter = "Ugyldig score, vennligst tast inn en gyldig score :)";
            i = i - 1 ; 
        }

        System.out.println(karakter);

        }
    }
}