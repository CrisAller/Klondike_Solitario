package Klondike;

public class VolteoCartaColumna extends Opcion {
	
	private Columna columna;

	public VolteoCartaColumna() {
		super("Voltear Carta en Columna");
	}

	@Override
	public void ejecutar(Tapete tapete) {
		columna = tapete.getColumna(super.recogerMazo("En", "Columna"));
		if(columna.vacia()) {
			System.out.println("Error!!! No hay cartas");
		}else if(columna.cima().bocaArriba()) {
			System.out.println("Error!!! La carta ya está boca arriba");
		}else {
			columna.cima().voltear();
		}
	}		
	
}
