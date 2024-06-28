package org.abstractanimals.java;

public class Cane extends Animale implements INuotante {
	
	@Override
	public void verso() {
		System.out.println("Il cane abbaia");
	}
	
	@Override
	public void mangia() {
		System.out.println("Il cane mangia carne e croccantini");
	}
	
	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
	
}
