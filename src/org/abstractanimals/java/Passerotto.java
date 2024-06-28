package org.abstractanimals.java;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("Il passerotto cinguetta");
	}
	
	@Override
	public void mangia() {
		System.out.println("Il passerotto mangia insetti");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}
}
