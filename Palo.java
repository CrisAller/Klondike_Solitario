package Klondike;

public class Palo extends Mazo {
	
//	private Carta[] cartas;
//	private int primerHueco;
	
	public Palo() {
		super(Baraja.NUM_NUMEROS, "Palo");
//		primerHueco=0;
//		cartas = new Carta[Baraja.NUM_NUMEROS];
	}

	public void mostrar() {
		System.out.print("Palo: ");
		if (this.vacia()) {
			System.out.println("VACIO");
		}else {
			this.cima().mostrar();
			System.out.print("\n");
		}
	}

	public void moverA(Columna columna) {
		assert columna!=null;
		if (this.vacia()) {
			System.out.println("Error!!! El palo está vacio");
		}else {
			Carta carta=this.sacar();
			if(carta.apilable(columna)) {
				carta.poner(columna);
			}else {
				this.poner(carta);
				System.out.println("Error!!! No se puede realizar este movimiento");
			}
		}
	}

	public boolean apilable(Carta carta) {
		assert carta!=null;
		return this.vacia()&&carta.esAs() || !this.vacia()&&carta.siguiente(this.cima()) && 
				carta.mismoPalo(this.cima());
	}
	
/*	protected boolean completa() {
		return primerHueco==Baraja.NUM_NUMEROS;
	}
	
	protected Carta cima() {
		return cartas[primerHueco-1];	
	}

	protected boolean vacia() {
		return primerHueco==0;
	}
	
	protected Carta sacar() {
		assert this!=null;
		primerHueco--;
		return cartas[primerHueco];
	}

	public void poner(Carta carta) {
		cartas[primerHueco]=carta;
		primerHueco++;
	}
*/
}
