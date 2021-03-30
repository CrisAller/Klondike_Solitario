package Klondike;

import java.util.Random;

public class Baraja extends Mazo {
	
	
	public final static int NUM_PALOS = 4;
	public final static int NUM_NUMEROS = 12;
		
	
	public Baraja() {
		super(NUM_PALOS*NUM_NUMEROS, "Baraja");
		for (int i=0; i<NUM_NUMEROS; i++) {
			for (int j = 0; j < NUM_PALOS; j++) {
				this.poner(new Carta(i,j));
			}
		}
		this.barajar();
	}

	public void mostrar() {
		System.out.print("Baraja: ");
		if (this.vacia()) {
			System.out.print("VACIA");
		}else {
			this.cima().mostrar();
		}
	}
	
	private void barajar() {
		Random aleatorio = new Random();
		for(int i=0;i<10000;i++) {
			int origen = NUM_PALOS*NUM_NUMEROS-1;
			int destino = aleatorio.nextInt(NUM_PALOS*NUM_NUMEROS-1);
			Carta carta = cartas[origen];
			cartas[origen]=cartas[destino];
			cartas[destino]= carta;
		}
	}


}
