package Klondike;

import java.util.Scanner;

public abstract class Opcion {
	
	protected String titulo;
	protected int numero;
	
	public Opcion(String titulo) {
		this.titulo = titulo;
	}
	
	public void mostrar(int posicion) {
		System.out.println((posicion + 1)+". "+this.titulo);
	}
	
	public abstract void ejecutar(Tapete tapete);
	
	public int recogerMazo(String string, String mazo) {
		numero=-1;
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
		Scanner entrada = new Scanner (System.in);
		numero = entrada.nextInt()-1;
		return numero;
	}
	
	private int pedirColumna(String string, String mazo) {
		int numero=-1;
		System.out.println("¿"+string+" que " +mazo+" quiere mover? [1-7]");
		Scanner entrada = new Scanner (System.in);
		numero = entrada.nextInt()-1;
		return numero;
	}
	
	
	
}
