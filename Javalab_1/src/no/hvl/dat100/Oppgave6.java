package no.hvl.dat100;

import easygraphics.*;

public class Oppgave6 extends EasyGraphics {

	  public static void main(String[] args) {
	    launch(args);
	  }

	  public void run() {
	    makeWindow("Det franske flagget", 400, 300);

	    setColor(0, 0, 255);
	    fillRectangle(250, 50, 100, 75);
	    setColor(255, 0, 0);
	    fillRectangle(50, 100, 100, 75);
	    setColor(0, 0, 0);
	    drawRectangle(50, 50, 300, 200);
	  }

	}