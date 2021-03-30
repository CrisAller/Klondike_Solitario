package Klondike;

public class Mazo {

	protected Carta[] cartas;
	protected int primerHueco;
	protected String titulo;
	private int cantidad;
	
	protected Mazo(int cantidad, String titulo) {
		primerHueco = 0;
		cartas = new Carta[cantidad];
		this.cantidad = cantidad;
		
	}
	
	protected void mostrar() {
		System.out.print(titulo+": ");
		if (this.vacia()) {
			System.out.print("VACIA");
		}else {
			this.cima().mostrar();
		}
	}
	
	public boolean vacia() {
		return primerHueco==0;
	}

	protected Carta cima() {
		return cartas[primerHueco-1];
	}
	
	public Carta sacar() {
		primerHueco--;
		return cartas[primerHueco];
	}

	public void poner(Carta carta) {
		assert carta!=null;
		cartas[primerHueco]=carta;
		primerHueco++;
	}
	protected boolean completa() {
		return primerHueco==cantidad;
	}

	
}
