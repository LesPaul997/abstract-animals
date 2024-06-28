package org.abstractanimals.java;

public class Main {

	public static void main(String[] args) {
		// Instanza e sottoclassi della classe Animale
		Cane scotty = new Cane();
		Passerotto benny = new Passerotto();
		Delfino curioso = new Delfino();
		Aquila peppe = new Aquila();
		
		scotty.verso();
		scotty.mangia();
		scotty.dormi();
		
		benny.verso();
		benny.mangia();
		benny.dormi();
		
		curioso.verso();
		curioso.mangia();
		curioso.dormi();
		
		peppe.verso();
		peppe.mangia();
		peppe.dormi();
		
		deveNuotare(scotty);
		deveNuotare(curioso);
		deveVolare(benny);
		deveVolare(peppe);
		
	}
	
	public static void deveNuotare(INuotante animale) {
		animale.nuota();
	}
	
	public static void deveVolare(IVolante animale) {
		animale.vola();
	}
	
	

}
