package Klondike;

public class Carta {
	
	private int palo;
	private int numero;
	private String[] PALOS = new String[] {"Corazones","Diamantes","Picas","Trebol"};
	private String[] NUMEROS = new String[] {"As","2","3","4","5","6","7","8","9","J","Q","K"};
	private boolean bocaArriba;
	
	public Carta(int numero, int palo) {
		this.palo = palo;
		this.numero = numero;
		this.bocaArriba=false;
	}
		
	public void mostrar() {
		String numero = "???";
		String palo = "???";
		if(this.bocaArriba()) {
			numero = NUMEROS[this.numero];
			palo = PALOS[this.palo];
		}
		System.out.print("("+numero+ " de "+palo+")");
	}
	
	public boolean bocaArriba() {
		return bocaArriba;
	}

	public void voltear() {
		bocaArriba=!bocaArriba;		
	}

	public boolean apilable(Columna columna) {
		return columna.apilable(this);
	}

	public void poner(Columna columna) {
		columna.poner(this);
	}

	public boolean esAs() {
		return this.NUMEROS[this.numero]== "As";
	}

	public boolean siguiente(Carta carta) {
		return carta.numero+1 == this.numero;
	}

	public boolean mismoPalo(Carta cima) {
		return cima.palo == this.palo;
	}
	
	public boolean mismoColor(Carta carta) {
		if(carta.palo==0 || carta.palo==1) {
			return this.palo==0 || this.palo==1;
		}else return this.palo==2 || this.palo==3;  
	}

	public boolean bocaAbajo() {
		return !bocaArriba;
	}

	public boolean esRey() {
		return this.NUMEROS[this.numero] == "K";
	}
	
	public static void main(String[] args){
		
	}

	
}
