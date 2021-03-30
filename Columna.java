package Klondike;

public class Columna extends Mazo {

	private int posicion;
	
	public Columna(int posicion, Baraja baraja) {
		super(posicion+Baraja.NUM_NUMEROS, "Columna "+posicion);
		this.posicion=posicion;

		for(int i=0;i<posicion;i++) {
			Carta carta = baraja.sacar();
			if(i==posicion-1) {
				carta.voltear();
			}
			this.poner(carta);
		}
	}
	
	public void mostrar() {
		System.out.print("Columna "+posicion+": ");
		if(this.vacia()) {
			System.out.print("VACIA");
		}else {
			for(int i=0;i<primerHueco;i++) {
				cartas[i].mostrar();
			}
		}System.out.println("");		
	}

	public boolean apilable(Carta carta) {
		return this.vacia() && carta.esRey() && carta.bocaArriba() ||
				this.cima().siguiente(carta) && !this.cima().mismoColor(carta) && carta.bocaArriba(); 
	}


}
