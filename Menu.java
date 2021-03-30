package Klondike;

import java.util.Scanner;

public class Menu {
	
	private Opcion[] opciones;
	private int titulos;
	public Object[] getOpcion;

	

	public Menu() {
		this.opciones = new Opcion[100];
		this.titulos = 0;
	}
	
	public void mostrar() {
		for(int i=0; i<titulos; i++) {
			opciones[i].mostrar(i);
		}
	}
	
	public void anadir(Opcion opcion) {
		opciones[titulos]= opcion;
		titulos++;	
	}
	
	public Opcion getOption() {
		int option;
		boolean error;
		do{
			System.out.println("Selecciona una opción [1-9]");
			Scanner entrada = new Scanner(System.in);
			option = entrada.nextInt();
			error = option<1 || option>9;
			if (error) {
				System.out.println("Error!!! La opción debe ser entre 1 y 9");
			}
		}while (error);
		return opciones[option-1];
	}

	public static void main(String[] arg) {
		Menu menu = new Menu();
		menu.mostrar();
	}

	public Opcion getOpcion(int numero) {
		return opciones[numero];
	}



	
	
}
