package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Basis4 {

    public static void main(String[] args) {
        int bruttoinntekt = Integer.parseInt(showInputDialog("Skriv inn bruttoinntekt her: "));
        
        int trinn1 = 190350;
        int trinn2 = 267900;
        int trinn3 = 643800;
        int trinn4 = 969200;
        int trinn5 = 2000000;
        
        double trinn1sats = 0.017;
        double trinn2sats = 0.04;
        double trinn3sats = 0.134;
        double trinn4sats = 0.164;
        double trinn5sats = 0.174;
        
        int skatt = 0;
        
        if (bruttoinntekt >= trinn1) {
            skatt += (bruttoinntekt-trinn1)*trinn1sats;
        }
        
        if (bruttoinntekt >= trinn2) {
            skatt += (bruttoinntekt-trinn2)*trinn2sats;
        }
        
        if (bruttoinntekt >= trinn3) {
            skatt += (bruttoinntekt-trinn3)*trinn3sats;
        }
        
        if (bruttoinntekt >= trinn4) {
            skatt += (bruttoinntekt-trinn4)*trinn4sats;
        }
        
        if (bruttoinntekt >= trinn5) {
            skatt += (bruttoinntekt-trinn5)*trinn5sats;
        }

        
        int nettolønn = bruttoinntekt - skatt;
        
        
        System.out.println("Bruttoinntekt: " + bruttoinntekt + "kr");
        System.out.println("Skatt: " + skatt + "kr");
        System.out.println("Nettolønn: " + nettolønn + "kr");
        
        
    }

}