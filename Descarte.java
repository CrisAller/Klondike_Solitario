package Klondike;

public class Descarte extends Mazo {
	
	private final static int CARTAS_COLUMNAS=28;
	
	public Descarte() {
		super(Baraja.NUM_PALOS*Baraja.NUM_NUMEROS - CARTAS_COLUMNAS, "Descarte");		
	}

	public void mostrar() {
		System.out.print("\n"+"Descarte: ");
		if(this.vacia()) {
			System.out.println("VACIA");
		}else {
			int primeraVisible = primerHueco-3;
			if(primeraVisible<0) {
				primeraVisible=0;
			}
			for (int i = primeraVisible; i <primerHueco ; i++) {
				cartas[i].mostrar();
			}
			System.out.print("\n");
		}
	}

}
