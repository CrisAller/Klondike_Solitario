package Klondike;

public class Tapete {

	private Mazo[] mazos;
	public final static int NUM_COLUMNAS = 7;


	public Tapete() {
		mazos = new Mazo[13];
		mazos[0]=new Baraja();
		mazos[1]= new Descarte();
		for (int i=0; i<Baraja.NUM_PALOS; i++) {
			mazos[i+2]= new Palo();
		}
		for (int i=0; i<NUM_COLUMNAS;i++) {
			mazos[i+6]= new Columna(i+1, this.getBaraja());
		}
	}
	
	public Tapete getTapete() {
		return this;
	}
	
	public Baraja getBaraja() {
		return (Baraja)mazos[0];
	}
	
	public Descarte getDescarte() {
		return (Descarte)mazos[1];
	}
	
	
	public Palo getPalo(int posicion) {
		return (Palo)mazos[posicion+2];
	}
	
	public Columna getColumna(int posicion) {
		return (Columna)mazos[posicion+6];
	}
	
	
	public void mostrar() {
		for (Mazo mazo:mazos) {
			mazo.mostrar();
		}
	}
		
/*	public int recogerMazo(String string, String mazo) {
		int numero=-1;
		boolean error;
		do {
			if (mazo == "Palo") {
				numero = this.pedirPalo(string, mazo);
				error = numero<0 ||numero>3;
			}else {			
				numero = this.pedirColumna(string, mazo);
				error = numero<0 ||numero>7;
			}
			if (error) {
				if(mazo == "Palo") {
				System.out.println("Error!!! Selecciona "+mazo+" entre 1 y 4");
				}else {
					System.out.println("Error!!! Selecciona "+mazo+" entre 1 y 7");
				}
			}
		}while (error);
		return numero;		
	}
	
	private int pedirPalo(String string, String mazo) {
		int numero=-1;
		System.out.println("¿"+string+" que " +mazo+" quiere mover? [1-4]");
		numero = new Scanner(System.in).nextInt()-1;
		return numero;
	}
	
	private int pedirColumna(String string, String mazo) {
		int numero=-1;
		System.out.println("¿"+string+" que " +mazo+" quiere mover? [1-7]");
		numero = new Scanner(System.in).nextInt()-1;
		return numero;
	}
*/
	public boolean finJuego() {
		boolean finJuego = false;
		for(int i=0; i<Baraja.NUM_PALOS; i++) {
			if (mazos[i+2].completa()==true) {
				finJuego=true;
			}
		}return finJuego;
	}

	
	
	
	
}
